package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LERMANGAS", "Lermangas", "pt")
internal class Lermangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LERMANGAS, "lermangas.me", pageSize = 20) {
	override val datePattern = "dd 'de' MMMMM 'de' yyyy"
}
