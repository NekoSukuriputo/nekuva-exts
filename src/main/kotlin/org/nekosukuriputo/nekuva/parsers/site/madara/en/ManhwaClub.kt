package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWACLUB", "Manhwaclub", "en", ContentType.HENTAI)
internal class ManhwaClub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWACLUB, "manhwaclub.net") {
	override val postReq = true
}
