package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ZINCHANMANGA", "ZinChanManga.Com", "en", ContentType.HENTAI)
internal class ZinChanManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINCHANMANGA, "zinchangmanga.net", 10)
