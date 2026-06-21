package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGACLASH", "MangaClash", "en")
internal class Mangaclash(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGACLASH, "mangaclash.com", pageSize = 18) {
	override val datePattern = "MM/dd/yyyy"
}
