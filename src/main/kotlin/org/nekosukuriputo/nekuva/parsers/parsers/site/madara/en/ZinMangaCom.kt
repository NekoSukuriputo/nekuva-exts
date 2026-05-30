package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ZIN_MANGA_COM", "Zin-Manga.com", "en")
internal class ZinMangaCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZIN_MANGA_COM, "zin-manga.com") {
	override val selectPage = "img"
}
