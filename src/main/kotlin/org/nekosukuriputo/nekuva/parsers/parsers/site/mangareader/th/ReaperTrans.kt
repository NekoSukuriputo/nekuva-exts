package org.nekosukuriputo.nekuva.parsers.site.mangareader.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("REAPERTRANS", "ReaperTrans", "th")
internal class ReaperTrans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.REAPERTRANS, "reapertrans.com", pageSize = 30, searchPageSize = 14) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
	override val sourceLocale: Locale = Locale.ENGLISH
}
