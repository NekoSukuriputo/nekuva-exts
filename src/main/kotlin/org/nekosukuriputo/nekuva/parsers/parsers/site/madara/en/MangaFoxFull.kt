package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAFOXFULL", "MangaFoxFull", "en")
internal class MangaFoxFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAFOXFULL, "mangafoxfull.com") {
	override val postReq = true
}
