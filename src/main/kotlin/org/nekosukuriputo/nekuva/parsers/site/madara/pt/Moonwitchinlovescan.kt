package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser


@MangaSourceParser("MOONWITCHINLOVESCAN", "MoonWitchinScan", "pt")
internal class Moonwitchinlovescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MOONWITCHINLOVESCAN, "moonwitchscan.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
