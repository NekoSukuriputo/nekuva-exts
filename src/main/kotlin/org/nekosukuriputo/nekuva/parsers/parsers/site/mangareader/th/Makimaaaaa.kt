package org.nekosukuriputo.nekuva.parsers.site.mangareader.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAKIMAAAAA", "Makimaaaaa", "th")
internal class Makimaaaaa(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MAKIMAAAAA, "makimaaaaa.com", pageSize = 30, searchPageSize = 30) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
