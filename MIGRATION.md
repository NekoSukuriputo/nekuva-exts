# MIGRATION.md — nekuva-exts (Runtime Extensions)

Tracks the **runtime-loadable extension (plugin)** migration on the `nekuva-exts` side: letting the host
app (Nekuva) update the manga-source catalog by downloading a new bundle, instead of rebuilding the app
for every new source. The host-side design + rationale live in the Nekuva UI repo's `MIGRATION.md`
(Section G). Reference implementation: **Usagi** (`github.com/UsagiApp/Usagi`, Kotatsu-based, Android-only).

## Host ⇄ extension contract (the ABI)

Public entry point (`org.nekosukuriputo.nekuva.parsers.NekuvaExtensions`), read by the host via reflection
after it loads this bundle's jar/dex through a class loader:

- `ABI_VERSION: Int` — host checks this before loading a downloaded bundle; mismatch → refuse (avoids
  `NoSuchMethodError` across versions).
- `listSources(): List<SourceDescriptor>` — host-readable list (name/title/locale/contentType/isBroken)
  WITHOUT touching the bundle-private `MangaParserSource` enum.
- `createParser(sourceName, context): MangaParser` — instantiate a parser by name.

Only **shared contract types** cross the boundary (`MangaParser`, `MangaLoaderContext`, `model.*`,
`SourceDescriptor`); the host provides them + okhttp/jsoup/kotlin-stdlib via **parent classloader
delegation**, so the plugin jar stays thin (just parser impls + the generated factory/enum + entry point).

## Steps & status

- [x] **Step 1 — ABI entry point.** `NekuvaExtensions` + `SourceDescriptor` (`src/main/.../parsers/`).
      Additive / non-breaking; compile-time (JitPack) usage unchanged.
- [x] **Step 2 — Desktop plugin artifact + catalog + CI.**
  - Gradle `assemblePluginArtifacts` → `build/plugin/nekuva-ext-desktop.jar` (thin) + `index.json`
    (`{abiVersion, version, artifacts.desktop.{file, sha256}}`).
  - `.github/workflows/extensions.yml`: on `v*` tag → build + attach the jar + `index.json` to the
    GitHub Release (JitPack compile-time build is independent).
- [ ] **Step 3 — Android (dexed) artifact.** Run `d8`/R8 over the thin jar → `classes.dex` in a jar so
      the host's `DexClassLoader` can load it. ⚠️ Needs the **Android SDK / android.jar** in this build
      (repo is currently pure JVM) — decide: add an Android module here vs a separate APK-style build
      (à la Tachiyomi). Extend `index.json` with `artifacts.android` + the workflow to upload it.
- [ ] **Step 4 — signing + richer index.** Sign artifacts (host verifies authenticity — only official
      builds load) and add the source list to `index.json` so the host can preview before downloading.
- [ ] **Step 5 — host side (Nekuva UI repo, separate branch).** Classloader `expect/actual` (Desktop
      `URLClassLoader`, Android `DexClassLoader` with selective ABI delegation, iOS no-op) + runtime
      `MangaSourceRegistry` (sources by string id, drop the hardcoded enum dependency) + Settings → About
      → "Update extensions" UI. **iOS stays bundled-only** (no dynamic class loading) — model is **hybrid**:
      baseline bundled parsers + Android/Desktop load updates on top.

## Notes / TODO

- Keep `extAbiVersion` (build.gradle.kts) in sync with `NekuvaExtensions.ABI_VERSION` — TODO: generate the
  Kotlin constant from one gradle source (like the host's generated `AppInfo.VERSION_NAME`).
- The thin plugin jar must NOT bundle okhttp/jsoup/kotlin-stdlib/contract — those are provided by the host
  loader via parent delegation (matches Usagi's `PluginClassLoader`).
