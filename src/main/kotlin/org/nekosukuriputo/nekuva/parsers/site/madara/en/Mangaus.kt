package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite")
@MangaSourceParser("MANGAUS", "Mangaus", "en")
internal class Mangaus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAUS, "mangaus.xyz") {
	override val withoutAjax = true
}
