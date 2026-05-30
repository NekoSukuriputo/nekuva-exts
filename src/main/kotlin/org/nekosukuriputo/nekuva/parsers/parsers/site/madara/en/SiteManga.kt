package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SITEMANGA", "SiteManga", "en")
internal class SiteManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SITEMANGA, "sitemanga.com") {
	override val datePattern = "MM/dd/yyyy"
}
