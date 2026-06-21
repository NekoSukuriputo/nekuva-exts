package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is online but layout changed — parser no longer matches page structure")
@MangaSourceParser("GATEMANGA", "GateManga", "ar")
internal class GateManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GATEMANGA, "gatemanga.com") {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
	override val listUrl = "ar/"
	override val withoutAjax = true
}
