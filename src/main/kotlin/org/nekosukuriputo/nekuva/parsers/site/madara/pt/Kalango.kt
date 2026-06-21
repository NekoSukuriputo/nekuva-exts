package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("KALANGO", "Kalango", "pt")
internal class Kalango(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KALANGO, "kalango.org") {
	override val datePattern: String = "dd 'de' MMMM 'de' yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
}
