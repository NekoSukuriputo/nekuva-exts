package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LIMBOSCAN", "LimboScan", "pt")
internal class LimboScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIMBOSCAN, "limboscan.com.br") {
	override val tagPrefix = "obras-genre/"
	override val listUrl = "obras/"
	override val datePattern: String = "dd/MM/yyyy"
}
