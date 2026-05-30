package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MORTALSGROOVE", "MortalsGroove", "en")
internal class MortalsGroove(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MORTALSGROOVE, "mortalsgroove.com") {
	override val postReq = true
}
