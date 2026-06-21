package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMUNDODRAMA", "InmortalScan", "es")
internal class MangaMundoDrama(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAMUNDODRAMA, "scaninmortal.com") {
	override val listUrl = "mg/"
}
