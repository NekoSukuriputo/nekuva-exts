package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LKSCANLATION", "LkScanlation", "es")
internal class LkScanlation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LKSCANLATION, "lkscanlation.com") {
	override val tagPrefix = "manhwa-genre/"
	override val listUrl = "manhwa/"
}
