package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LIMITEDTIMEPOJECT", "LimitedTimePoject", "pt")
internal class LimitedTimePoject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIMITEDTIMEPOJECT, "limitedtimeproject.com", 10) {
	override val listUrl = "manhwa/"
	override val tagPrefix = "manhwa-genero/"
	override val datePattern = "dd/MM/yyyy"
}
