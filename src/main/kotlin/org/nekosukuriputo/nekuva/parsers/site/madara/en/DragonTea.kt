package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("DRAGONTEA", "DragonTea", "en")
internal class DragonTea(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DRAGONTEA, "dragontea.ink") {
	override val datePattern = "MM/dd/yyyy"
}
