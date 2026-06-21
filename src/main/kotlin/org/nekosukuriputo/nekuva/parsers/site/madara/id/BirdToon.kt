package org.nekosukuriputo.nekuva.parsers.site.madara.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("BIRDTOON", "BirdToon", "id", ContentType.HENTAI)
internal class BirdToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BIRDTOON, "birdtoon.shop", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val tagPrefix = "komik-genre/"
	override val listUrl = "komik/"
}
