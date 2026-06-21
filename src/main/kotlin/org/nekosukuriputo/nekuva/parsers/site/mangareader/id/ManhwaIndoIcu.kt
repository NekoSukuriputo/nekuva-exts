package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANHWAINDOICU", "KomikCinta", "id", ContentType.HENTAI)
internal class ManhwaIndoIcu(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWAINDOICU, "komikdewasa.art", pageSize = 30, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "/komik"
}
