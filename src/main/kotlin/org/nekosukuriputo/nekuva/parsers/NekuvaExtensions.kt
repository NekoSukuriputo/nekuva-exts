package org.nekosukuriputo.nekuva.parsers

import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource

/**
 * Lightweight, host-readable description of one source in this extension bundle.
 *
 * The host (Nekuva) shares this type (it depends on this artifact's contract), so it can list/display
 * sources WITHOUT referencing the bundle-private [MangaParserSource] enum — important once parsers are
 * loaded at runtime from a downloaded bundle rather than compiled into the app.
 */
public data class SourceDescriptor(
	public val name: String,
	public val title: String,
	public val locale: String,
	public val contentType: ContentType,
	public val isBroken: Boolean,
)

/**
 * Public entry point for using this parser bundle as a runtime "extension" (plugin) instead of a
 * compile-time dependency.
 *
 * A host that loads the bundle's jar (Desktop) / dexed jar (Android) through a class loader uses
 * reflection on this object to (1) enumerate the sources it provides and (2) instantiate a parser by
 * name — without compiling the parsers in. This keeps the bundle-private [MangaParserSource] enum and
 * the `newParser` factory off the host's compile classpath; only the shared contract types
 * ([MangaParser], [MangaLoaderContext], models, [SourceDescriptor]) cross the boundary.
 *
 * Keep this API stable; bump [ABI_VERSION] on any incompatible change — the host checks it before
 * loading a downloaded bundle and refuses a mismatch (avoids `NoSuchMethodError` across versions).
 */
public object NekuvaExtensions {

	/** Host⇄extension contract version. Bump on any breaking change to this entry point or the parser ABI. */
	public const val ABI_VERSION: Int = 1

	/** Every source this bundle provides, as host-readable descriptors. */
	public fun listSources(): List<SourceDescriptor> = MangaParserSource.entries.map { source ->
		SourceDescriptor(
			name = source.name,
			title = source.title,
			locale = source.locale,
			contentType = source.contentType,
			isBroken = source.isBroken,
		)
	}

	/** Instantiate the parser for [sourceName] (a [SourceDescriptor.name] from [listSources]). */
	public fun createParser(sourceName: String, context: MangaLoaderContext): MangaParser {
		val source = MangaParserSource.entries.firstOrNull { it.name == sourceName }
			?: throw IllegalArgumentException("Unknown manga source: $sourceName")
		return source.newParser(context)
	}
}
