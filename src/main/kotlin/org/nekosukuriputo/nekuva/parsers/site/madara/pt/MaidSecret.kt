package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MAIDSECRET", "MaidSecret", "pt")
internal class MaidSecret(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MAIDSECRET, "maidsecret.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
