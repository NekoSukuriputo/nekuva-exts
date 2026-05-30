package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("GHOSTSCAN", "GhostScan", "pt")
internal class GhostScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GHOSTSCAN, "ghostscan.xyz", 24) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
