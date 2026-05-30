package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("CABAREDOWATAME", "DessertScan", "pt")
internal class Cabaredowatame(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CABAREDOWATAME, "cabaredowatame.site", 10) {
	override val datePattern = "dd/MM/yyyy"
}
