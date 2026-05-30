package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("GEKKOUSCANS", "GekkouScans", "pt", ContentType.HENTAI)
internal class GekkouScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GEKKOUSCANS, "gekkou.site") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
