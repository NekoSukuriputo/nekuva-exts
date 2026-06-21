package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONLINETEAM", "MangaOnlineTeam", "en")
internal class MangaOnlineTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONLINETEAM, "mangaonlineteam.com", 10)
