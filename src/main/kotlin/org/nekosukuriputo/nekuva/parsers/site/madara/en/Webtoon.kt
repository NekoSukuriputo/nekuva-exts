package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("WEBTOON", "Webtoon.uk", "en")
internal class Webtoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WEBTOON, "webtoon.uk", 20) {
	override val tagPrefix = "manhwa-genre/"
	override val postReq = true
}
