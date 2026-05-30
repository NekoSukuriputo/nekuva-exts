package org.nekosukuriputo.nekuva.parsers.site.madara.all

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("EROMANHWA", "EroManhwa", "", ContentType.HENTAI)
internal class EroManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EROMANHWA, "eromanhwa.org") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
