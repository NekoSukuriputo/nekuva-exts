package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("BOYS_LOVE", "BoysLove", "en", ContentType.HENTAI)
internal class BoysLove(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BOYS_LOVE, "boyslove.me", 20) {
	override val tagPrefix = "boyslove-genre/"
	override val listUrl = "boyslove/"
	override val postReq = true
}
