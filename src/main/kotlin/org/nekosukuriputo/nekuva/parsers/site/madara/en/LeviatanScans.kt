package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Server not responding — connection times out")
@MangaSourceParser("LEVIATANSCANS", "LsComic", "en")
internal class LeviatanScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEVIATANSCANS, "lscomic.com", 10)
