package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAFORFREE", "MangaForFree", "en", ContentType.HENTAI)
internal class MangaForFree(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAFORFREE, "mangaforfree.com", 10) {
	override val postReq = true
}
