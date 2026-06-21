package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

//This source requires an account.
@MangaSourceParser("OPIATOON", "OpiaToon", "tr")
internal class OpiaToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.OPIATOON, "opiatoon.art", 20) {
	override val datePattern = "d MMMM"
}
