package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Connection refused — server offline") // atemporal.cloud is offline (connection refused) and no successor domain has surfaced publicly.
@MangaSourceParser("ATEMPORAL", "Atemporal", "pt")
internal class Atemporal(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATEMPORAL, "atemporal.cloud") {
	override val datePattern: String = "d 'de' MMMM 'de' yyyy"
	override val withoutAjax = true
}
