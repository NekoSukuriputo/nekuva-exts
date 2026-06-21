package org.nekosukuriputo.nekuva.parsers.site.mangareader.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("PORNHWASCANS", "PornhwaScans", "fr")
internal class PornhwaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PORNHWASCANS, "pornhwascans.fr", pageSize = 24, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
	override val selectChapter = "div.chapter-list > a.chapter-item"

}
