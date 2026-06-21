package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("KORELISCANS", "KoreliScans", "tr")
internal class KoreliScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KORELISCANS, "koreliscans.com", 10) {
	override val datePattern = "d MMMM"
}
