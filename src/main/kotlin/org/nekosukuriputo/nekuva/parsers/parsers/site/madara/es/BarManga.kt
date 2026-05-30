package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("BARMANGA", "BarManga", "es")
internal class BarManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BARMANGA, "barmanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
