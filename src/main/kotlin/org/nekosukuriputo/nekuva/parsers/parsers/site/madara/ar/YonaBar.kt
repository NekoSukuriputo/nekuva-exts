package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("YONABAR", "YonaBar", "ar")
internal class YonaBar(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YONABAR, "yonabar.xyz", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "yaoi/"
}
