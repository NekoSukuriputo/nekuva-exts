package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ANIKIGA", "Anikiga", "tr")
internal class Anikiga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ANIKIGA, "anikiga.com") {
	override val tagPrefix = "manga-tur/"
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
