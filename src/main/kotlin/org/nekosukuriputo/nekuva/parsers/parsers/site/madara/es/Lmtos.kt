package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("LMTOS", "Lmtos", "es")
internal class Lmtos(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LMTOS, "lmtos.com") {
	override val datePattern = "dd/MM"
}
