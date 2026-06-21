package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain parked — landing page only, no manga content")
@MangaSourceParser("LINKSTARTSCAN", "LinkStartScan", "pt")
internal class LinkStartScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LINKSTARTSCAN, "www.linkstartscan.xyz") {
	override val datePattern: String = "dd/MM/yyyy"
}
