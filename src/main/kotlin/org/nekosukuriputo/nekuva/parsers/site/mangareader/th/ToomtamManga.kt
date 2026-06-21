package org.nekosukuriputo.nekuva.parsers.site.mangareader.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TOOMTAMMANGA", "ToomtamManga", "th", ContentType.HENTAI)
internal class ToomtamManga(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.TOOMTAMMANGA,
		"toomtam-manga.com",
		pageSize = 30,
		searchPageSize = 28,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
