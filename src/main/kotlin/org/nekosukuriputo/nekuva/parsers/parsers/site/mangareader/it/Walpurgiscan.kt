package org.nekosukuriputo.nekuva.parsers.site.mangareader.it

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("WALPURGISCAN", "WalpurgiScan", "it")
internal class Walpurgiscan(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.WALPURGISCAN,
		"www.walpurgiscan.it",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
