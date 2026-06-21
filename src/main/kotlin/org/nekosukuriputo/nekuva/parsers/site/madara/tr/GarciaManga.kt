package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("GARCIAMANGA", "GarciaManga", "tr")
internal class GarciaManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GARCIAMANGA, "garciamanga.com", 20) {
	override val selectPage = "img"
}
