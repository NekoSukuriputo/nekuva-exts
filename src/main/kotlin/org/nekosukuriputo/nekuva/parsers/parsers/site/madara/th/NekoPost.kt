package org.nekosukuriputo.nekuva.parsers.site.madara.th

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Redirect to @KINGS_MANGA")
@MangaSourceParser("NEKOPOST", "NekoPost", "th", ContentType.HENTAI)
internal class NekoPost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEKOPOST, "www.superdoujin.org") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
