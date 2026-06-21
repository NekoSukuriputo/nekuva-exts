package org.nekosukuriputo.nekuva.parsers.site.madara.ja

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("RAWMANGA", "RawManga", "ja")
internal class RawManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWMANGA, "rawmanga.su", 24) {
	override val listUrl = "r/"
	override val selectPage = "div.mg-item"
}
