package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("GALINHASAMURAI", "GalinhaSamurai", "pt")
internal class GalinhaSamurai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GALINHASAMURAI, "galinhasamurai.com") {
	override val datePattern = "dd/MM/yyyy"
	override val withoutAjax = true
}
