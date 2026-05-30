package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Not dead, changed template")
@MangaSourceParser("HAREMSCANN", "HaremScann", "es")
internal class HaremScann(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HAREMSCANN, "haremscann.es") {
	override val postReq = true
}
