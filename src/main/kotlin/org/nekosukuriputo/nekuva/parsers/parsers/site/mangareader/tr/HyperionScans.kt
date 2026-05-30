package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("HYPERIONSCANS", "SeraphManga", "tr")
internal class HyperionScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.HYPERIONSCANS,
		"www.seraphmanga.com",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
