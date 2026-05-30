package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANGADOP", "MangaDop", "id", ContentType.HENTAI)
internal class Mangadop(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGADOP, "mangadop.net", pageSize = 20, searchPageSize = 20) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
