package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LEGENDSCANLATIONS", "LegendScanlations", "es")
internal class LegendScanlations(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEGENDSCANLATIONS, "escaneodeleyendas.com", 10) {
	override val datePattern = "dd/MM/yyyy"
}
