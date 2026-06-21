package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("ARLAS", "Arlas", "id")
internal class Arlas(context: MangaLoaderContext) :
    ZeistMangaParser(context, org.nekosukuriputo.nekuva.parsers.model.MangaParserSource.ARLAS, "arlas.my.id")
