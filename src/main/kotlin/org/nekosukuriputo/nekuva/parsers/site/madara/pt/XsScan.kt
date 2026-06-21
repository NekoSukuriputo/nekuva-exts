package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("XSSCAN", "XsScan", "pt")
internal class XsScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.XSSCAN, "xsscan.xyz") {
	override val datePattern: String = "dd/MM/yyyy"
}
