package org.nekosukuriputo.nekuva.parsers.site.mangareader.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("RAGNASCAN", "RagnaScan", "es")
internal class RagnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RAGNASCAN, "ragnascan.com", pageSize = 5, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
