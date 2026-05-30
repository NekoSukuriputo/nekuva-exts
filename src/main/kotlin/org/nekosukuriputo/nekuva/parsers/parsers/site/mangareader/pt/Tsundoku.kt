package org.nekosukuriputo.nekuva.parsers.site.mangareader.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TSUNDOKU", "Tsundoku", "pt")
internal class Tsundoku(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TSUNDOKU, "tsundoku.com.br", pageSize = 50, searchPageSize = 50) {
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
