package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.*
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MINITWOSCAN", "MiniTwoScan", "pt")
internal class MiniTwoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MINITWOSCAN, "minitwoscan.com") {
	override val withoutAjax = true
	override val postReq = true
}
