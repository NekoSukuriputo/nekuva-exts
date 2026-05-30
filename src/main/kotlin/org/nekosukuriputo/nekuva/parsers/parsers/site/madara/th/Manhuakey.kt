package org.nekosukuriputo.nekuva.parsers.site.madara.th

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken
import java.util.*

@Broken
@MangaSourceParser("MANHUAKEY", "ManhuaKey", "th")
internal class Manhuakey(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAKEY, "www.manhuakey.com", 10) {
	override val datePattern: String = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
