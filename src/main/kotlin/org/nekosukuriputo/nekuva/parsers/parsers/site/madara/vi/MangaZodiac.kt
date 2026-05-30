package org.nekosukuriputo.nekuva.parsers.site.madara.vi

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAZODIAC", "MangaZodiac", "vi")
internal class MangaZodiac(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAZODIAC, "mangazodiac.com")
