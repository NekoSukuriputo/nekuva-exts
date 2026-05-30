package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOISCAN", "YaoiScan", "en", ContentType.HENTAI)
internal class YaoiScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOISCAN, "yaoiscan.com", 20)
