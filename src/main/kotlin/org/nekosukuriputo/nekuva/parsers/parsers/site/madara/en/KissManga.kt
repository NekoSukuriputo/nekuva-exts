package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("KISSMANGA", "KissManga", "en")
internal class KissManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KISSMANGA, "kissmanga.in") {
	override val datePattern = "MMMM dd, yyyy"
	override val listUrl = "mangalist/"
}
