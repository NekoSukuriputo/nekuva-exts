package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is gone — root redirects to an unrelated domain")
@MangaSourceParser("FREECOMICONLINE", "FreeComicOnline", "en", ContentType.HENTAI)
internal class FreeComicOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREECOMICONLINE, "freecomiconline.me") {
	override val postReq = true
	override val listUrl = "comic/"
	override val tagPrefix = "comic-genre/"
}
