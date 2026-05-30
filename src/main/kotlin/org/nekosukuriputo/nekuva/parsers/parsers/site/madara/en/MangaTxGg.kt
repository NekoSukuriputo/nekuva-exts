package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATX_GG", "MangaTx.gg", "en")
internal class MangaTxGg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATX_GG, "mangatx.gg")
