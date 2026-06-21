package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOONXYZ", "Webtoon.xyz", "en", ContentType.HENTAI)
internal class WebtoonXyz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WEBTOONXYZ, "www.webtoon.xyz", 20) {
	override val tagPrefix = "webtoon-genre/"
	override val listUrl = "read/"
	override val datePattern = "d MMM yyyy"
}
