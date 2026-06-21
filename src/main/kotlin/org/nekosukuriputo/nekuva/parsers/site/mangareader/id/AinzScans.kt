package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("AINZSCANS", "AinzScans", "id")
internal class AinzScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.AINZSCANS, "v1.ainzscans01.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/allcomic"
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
