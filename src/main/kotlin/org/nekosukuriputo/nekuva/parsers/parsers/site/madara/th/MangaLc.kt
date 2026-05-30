package org.nekosukuriputo.nekuva.parsers.site.madara.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALC", "MangaLc", "th")
internal class MangaLc(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALC, "manga-lc.net", 24) {
	override val datePattern: String = "d MMMM yyyy"
	override val selectPage = "img"
}
