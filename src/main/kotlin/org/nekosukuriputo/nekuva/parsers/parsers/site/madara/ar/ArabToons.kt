package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ARABTOONS", "ArabToons", "ar", ContentType.HENTAI)
internal class ArabToons(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARABTOONS, "arabtoons.net") {
	override val datePattern = "dd-MM-yyyy"
}
