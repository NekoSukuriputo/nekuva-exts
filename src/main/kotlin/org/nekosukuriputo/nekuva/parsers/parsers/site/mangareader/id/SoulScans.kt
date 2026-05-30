package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("SOULSCANS", "SoulScans", "id")
internal class SoulScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SOULSCANS, "soulscans.my.id", pageSize = 30, searchPageSize = 30) {
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
