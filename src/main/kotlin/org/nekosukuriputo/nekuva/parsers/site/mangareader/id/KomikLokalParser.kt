package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKLOKAL", "KomikLokal", "id", ContentType.HENTAI)
internal class KomikLokalParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKLOKAL, "komikmu.top", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/komik"
	override val datePattern = "dd/MM/yyyy"
}
