package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATXUNOFFICIAL", "MangaEmpress", "en")
internal class MangaTxUnofficial(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATXUNOFFICIAL, "mangaempress.com")
