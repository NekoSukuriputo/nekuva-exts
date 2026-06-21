package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("NORTEROSE", "Norterose", "pt")
internal class Norterose(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NORTEROSE, "norterose.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
	override val withoutAjax = true
}
