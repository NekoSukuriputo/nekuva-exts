package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("ONLYMANHWA", "OnlyManhwa", "en")
internal class OnlyManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ONLYMANHWA, "onlymanhwa.org") {
	override val listUrl = "manhwa/"
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
