package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SWEETSCAN", "SweetScan", "pt")
internal class SweetScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SWEETSCAN, "sweetscan.net") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
