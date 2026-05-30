package org.nekosukuriputo.nekuva.parsers.site.madara.it

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("BEYONDTHEATARAXIA", "Beyond The Ataraxia", "it")
internal class Beyondtheataraxia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEYONDTHEATARAXIA, "www.beyondtheataraxia.com", 10) {
	override val datePattern = "d MMMM yyyy"
}
