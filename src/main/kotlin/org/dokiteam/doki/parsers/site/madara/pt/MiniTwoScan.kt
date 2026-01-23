package org.dokiteam.doki.parsers.site.madara.pt

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.*
import org.dokiteam.doki.parsers.site.madara.MadaraParser

@MangaSourceParser("MINITWOSCAN", "MiniTwoScan", "pt")
internal class MiniTwoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MINITWOSCAN, "minitwoscan.com") {
	override val withoutAjax = true
	override val postReq = true
}
