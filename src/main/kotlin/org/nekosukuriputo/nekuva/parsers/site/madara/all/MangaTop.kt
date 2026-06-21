package org.nekosukuriputo.nekuva.parsers.site.madara.all

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite")
@MangaSourceParser("MANGATOP", "MangaTop", "", ContentType.HENTAI)
internal class MangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATOP, "mangatop.site") {
	override val datePattern = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val stylePage = ""
}
