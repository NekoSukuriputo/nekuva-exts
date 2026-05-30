package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("YANPFANSUB", "YanpFansub", "pt")
internal class YanpFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YANPFANSUB, "trisalyanp.com") {
	override val datePattern = "d 'de' MMMM 'de' yyyy"
}
