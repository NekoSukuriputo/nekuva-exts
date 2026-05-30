package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("BEGATRANSLATION", "BegaTranslation", "es")
internal class BegaTranslation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEGATRANSLATION, "begatranslation.com") {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "series/"
}
