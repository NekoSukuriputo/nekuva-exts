package org.nekosukuriputo.nekuva.parsers.site.mangareader.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("VFSCAN", "VfScan", "fr")
internal class VfScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VFSCAN, "www.vfscan.net", pageSize = 18, searchPageSize = 18) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
