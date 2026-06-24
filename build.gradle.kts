import tasks.ReportGenerateTask
import java.security.MessageDigest

plugins {
    `java-library`
    `maven-publish`
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.ksp)
}

group = "org.nekosukuriputo"
version = "1.0"

tasks.test {
    useJUnitPlatform()
}

ksp {
    arg("summaryOutputDir", "${projectDir}/.github")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        freeCompilerArgs.addAll(
            "-Xannotation-default-target=param-property",
            "-opt-in=kotlin.RequiresOptIn",
            "-opt-in=kotlin.contracts.ExperimentalContracts",
            "-opt-in=kotlinx.coroutines.ExperimentalCoroutinesApi",
            "-opt-in=org.nekosukuriputo.nekuva.parsers.InternalParsersApi",
        )
    }
}

kotlin {
    jvmToolchain(17)
    explicitApiWarning()
    sourceSets["main"].kotlin.srcDirs("build/generated/ksp/main/kotlin")
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}

dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.okhttp)
    implementation(libs.okio)
    implementation(libs.json)
    implementation(libs.androidx.collection)
    api(libs.jsoup)

    ksp(project(":nekuva-ksp"))

    testImplementation(libs.junit.api)
    testImplementation(libs.junit.engine)
    testImplementation(libs.junit.params)
    testRuntimeOnly(libs.junit.launcher)
    testImplementation(libs.kotlinx.coroutines.test)
    testImplementation(libs.quickjs)
}

tasks.register<ReportGenerateTask>("generateTestsReport")

// ---- Runtime extension (plugin) artifacts — Step 2: Desktop ------------------------------------
// Produces the loadable Desktop plugin jar (the thin parser bundle; host provides okhttp/jsoup/stdlib +
// the shared contract via parent classloader delegation) plus an `index.json` catalog the host's
// "Update extensions" reads to decide whether to download. Android (dexed) artifact is Step 3.
//
// NOTE: keep `extAbiVersion` in sync with NekuvaExtensions.ABI_VERSION (TODO: generate from one source).
val extAbiVersion = 1

val assemblePluginArtifacts by tasks.registering {
    description = "Assemble the runtime extension (plugin) jar + index.json for the host updater."
    group = "distribution"
    val jarTask = tasks.named<org.gradle.api.tasks.bundling.Jar>("jar")
    dependsOn(jarTask)
    val jarFile = jarTask.flatMap { it.archiveFile }
    val outDir = layout.buildDirectory.dir("plugin")
    val abi = extAbiVersion
    // Release version: CI passes -PpluginVersion=<tag>; falls back to the project version locally.
    val pluginVersion = (project.findProperty("pluginVersion") as String?)?.takeIf { it.isNotBlank() }
        ?: project.version.toString()
    inputs.file(jarFile)
    outputs.dir(outDir)
    doLast {
        val out = outDir.get().asFile
        out.mkdirs()
        val target = out.resolve("nekuva-ext-desktop.jar")
        jarFile.get().asFile.copyTo(target, overwrite = true)
        val sha = MessageDigest.getInstance("SHA-256")
            .digest(target.readBytes())
            .joinToString("") { "%02x".format(it) }
        out.resolve("index.json").writeText(
            """
            {
              "abiVersion": $abi,
              "version": "$pluginVersion",
              "artifacts": {
                "desktop": { "file": "${target.name}", "sha256": "$sha" }
              }
            }
            """.trimIndent() + "\n",
        )
        logger.lifecycle("Extension plugin artifacts written to ${out.absolutePath}")
    }
}

// Stages the runtime dependencies (okhttp/jsoup/kotlin-stdlib/…) into build/plugin/deps so CI can pass
// them to `d8 --classpath` when dexing the Android bundle. They're only for reference resolution — the
// host provides them at runtime, so they are NOT included in the produced classes.dex.
val stagePluginDeps by tasks.registering(Copy::class) {
    description = "Copy runtime dependency jars for the Android d8 classpath."
    group = "distribution"
    from(configurations.named("runtimeClasspath"))
    into(layout.buildDirectory.dir("plugin/deps"))
    include("*.jar")
}
