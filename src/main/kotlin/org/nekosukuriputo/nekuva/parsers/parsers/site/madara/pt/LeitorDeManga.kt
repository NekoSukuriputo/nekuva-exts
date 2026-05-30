package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LEITORDEMANGA", "LeitorDeManga", "pt")
internal class LeitorDeManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEITORDEMANGA, "leitordemanga.com", 10) {
	override val datePattern = "dd/MM/yyyy"
	override val listUrl = "ler-manga/"
}
