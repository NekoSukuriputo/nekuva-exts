package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LECTORUNM", "Lectorunm.life", "es")
internal class Lectorunm(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORUNM, "lectorunm.life") {
	override val datePattern = "dd/MM/yyyy"
}
