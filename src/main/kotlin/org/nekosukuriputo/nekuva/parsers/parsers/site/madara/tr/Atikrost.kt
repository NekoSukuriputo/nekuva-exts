package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ATIKROST", "Atikrost", "tr")
internal class Atikrost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATIKROST, "www.mangaoku.org", 10) {
	override val datePattern = "d MMMM yyyy"
}
