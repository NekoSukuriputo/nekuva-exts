package org.nekosukuriputo.nekuva.parsers.site.madara.all

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("MANYTOON_CLUB", "ManyToon.club", "", ContentType.HENTAI)
internal class ManyToonClub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANYTOON_CLUB, "manytoon.club") {
	override val postReq = true
	override val listUrl = "manhwa-raw/"
	override val tagPrefix = "manhwa-raw-genre/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
