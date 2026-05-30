package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Not dead, changed template")
@MangaSourceParser("CERISE_SCANS", "CeriseScans", "pt")
internal class CeriseScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CERISE_SCANS, "cerise.leitorweb.com") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
