package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MUGIWARASOFICIAL", "MugiwarasOficial", "pt")
internal class MugiwarasOficial(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MUGIWARASOFICIAL, "mugiwarasoficial.com") {
	override val datePattern: String = "dd/MM/yyyy"
}
