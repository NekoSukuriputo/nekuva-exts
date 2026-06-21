package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ITSYOURIGHTMANHUA", "ItsYouRightManhua", "en")
internal class Itsyourightmanhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ITSYOURIGHTMANHUA, "itsyourightmanhua.com", 10)
