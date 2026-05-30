package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.*
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@Broken("Redirect to @XMANHWA")
@MangaSourceParser("INSTAMANHWA", "InstaManhwa", "en", ContentType.HENTAI)
internal class InstaManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INSTAMANHWA, "www.manhwaden.com", 15) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
