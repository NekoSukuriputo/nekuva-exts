package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("EMPERORSCAN", "EmperorScan", "es")
internal class EmperorScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EMPERORSCAN, "emperorscan.mundoalterno.org")
