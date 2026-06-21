package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Site is gone — root redirects to an unrelated domain")
@MangaSourceParser("MANGA_QUEEN", "MangaQueen", "en")
internal class MangaQueen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_QUEEN, "mangaqueen.com", 16)
