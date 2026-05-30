package org.nekosukuriputo.nekuva.parsers.site.zmanga.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zmanga.ZMangaParser
import java.util.*

@Broken
@MangaSourceParser("HENSEKAI", "Hensekai", "id", ContentType.HENTAI)
internal class Hensekai(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.HENSEKAI, "hensekai.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
