package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWARAW_COM", "ManhwaRaw.com", "en", ContentType.HENTAI)
internal class ManhwaRawCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWARAW_COM, "manhwaraw.com") {
	override val postReq = true
	override val listUrl = "manhwa-raw/"
	override val tagPrefix = "manhwa-raw-genre/"
}
