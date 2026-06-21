package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("S2MANGA", "S2Manga", "en")
internal class S2Manga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.S2MANGA, "s2manga.com") {
	override val datePattern = "MMMM dd, yyyy"
}
