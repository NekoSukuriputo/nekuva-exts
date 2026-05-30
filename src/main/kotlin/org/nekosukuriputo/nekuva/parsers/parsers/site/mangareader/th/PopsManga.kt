package org.nekosukuriputo.nekuva.parsers.site.mangareader.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("POPSMANGA", "PopsManga", "th")
internal class PopsManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.POPSMANGA, "popsmanga.com", pageSize = 20, searchPageSize = 14) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
