package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("YCSCAN", "YcScan", "pt", ContentType.HENTAI)
internal class Ycscan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YCSCAN, "ycscan.com", 20) {
	override val datePattern: String = "dd/MM/yyyy"
}
