package org.nekosukuriputo.nekuva.parsers.site.onemanga.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("DANDADAN", "Dandadan", "fr")
internal class Dandadan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.DANDADAN, "dandadan.fr")
