package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUVYAA", "Luvyaa", "id", ContentType.HENTAI)
internal class Luvyaa(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LUVYAA, "v2.luvyaa.co", 20, 10) {
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
