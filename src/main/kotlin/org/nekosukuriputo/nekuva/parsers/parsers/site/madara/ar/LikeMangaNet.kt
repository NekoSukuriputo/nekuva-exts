package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("LIKEMANGANET", "Like-Manga.net", "ar")
internal class LikeMangaNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LIKEMANGANET, "like-manga.net", pageSize = 10)
