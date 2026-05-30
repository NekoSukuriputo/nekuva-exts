package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("FENIXPROJECT", "FenixProject", "pt")
internal class FenixProject(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FENIXPROJECT, "fenixproject.site", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
