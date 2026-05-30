package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAKISS", "MangaKiss", "en")
internal class MangaKiss(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAKISS, "mangakiss.org", 10)
