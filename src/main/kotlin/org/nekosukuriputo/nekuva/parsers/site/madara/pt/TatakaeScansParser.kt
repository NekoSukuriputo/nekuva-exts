package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("TATAKAE_SCANS", "TatakaeScans", "pt")
internal class TatakaeScansParser(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TATAKAE_SCANS, "tatakaescan.com", pageSize = 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
