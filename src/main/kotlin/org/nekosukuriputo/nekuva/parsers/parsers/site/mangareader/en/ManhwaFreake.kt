package org.nekosukuriputo.nekuva.parsers.site.mangareader.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANHWAFREAKE", "ManhwaFreake", "en")
internal class ManhwaFreake(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWAFREAKE, "manhwafreake.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
