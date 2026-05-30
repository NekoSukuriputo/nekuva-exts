package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("KUROIMANGA", "KuroiManga", "tr", ContentType.HENTAI)
internal class KuroiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KUROIMANGA, "www.kuroimanga.com") {
	override val datePattern = "d MMMM yyyy"
}
