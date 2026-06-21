package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("UTOON", "UToon", "en")
internal class UToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.UTOON, "utoon.net") {
	override val datePattern = "dd MMM"
}
