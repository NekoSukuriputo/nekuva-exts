package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SAMURAISCAN", "SamuraiScan", "es")
internal class SamuraiScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SAMURAISCAN, "samuraiscan.com", 10) {
	override val listUrl = "read/"
}
