package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("GALAXSCANS", "GalaxScanlator", "pt")
internal class GalaxScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.GALAXSCANS, "galaxscanlator.blogspot.com") {
	override val mangaCategory = "Recentes"
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
