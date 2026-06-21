package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("ALTERKAISCANS", "AlterkaiScans", "id")
internal class AlterkaiScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ALTERKAISCANS,
		"alterkaiscans.my.id",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
