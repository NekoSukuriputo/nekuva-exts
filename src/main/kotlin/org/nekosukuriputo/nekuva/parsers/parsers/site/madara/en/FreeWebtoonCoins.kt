package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("FREEWEBTOONCOINS", "FreeWebtoonCoins", "en")
internal class FreeWebtoonCoins(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREEWEBTOONCOINS, "freewebtooncoins.com") {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "webtoon/"
}
