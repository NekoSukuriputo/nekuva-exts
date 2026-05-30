package org.nekosukuriputo.nekuva.parsers.site.madara.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGADEEMAK", "MangaDeemak", "th")
internal class Mangadeemak(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGADEEMAK, "mangadeemak.com", 12) {
	override val datePattern: String = "d MMMM yyyy"
}
