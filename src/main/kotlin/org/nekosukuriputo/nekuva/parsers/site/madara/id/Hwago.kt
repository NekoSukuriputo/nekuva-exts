package org.nekosukuriputo.nekuva.parsers.site.madara.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("HWAGO", "Hwago", "id")
internal class Hwago(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HWAGO, "hwago01.xyz") {
	override val datePattern = "d MMMM yyyy"
}
