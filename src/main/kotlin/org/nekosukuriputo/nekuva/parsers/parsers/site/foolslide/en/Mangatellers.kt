package org.nekosukuriputo.nekuva.parsers.site.foolslide.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("MANGATELLERS", "Mangatellers", "en")
internal class Mangatellers(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.MANGATELLERS, "reader.mangatellers.gr") {
	override val pagination = false
}
