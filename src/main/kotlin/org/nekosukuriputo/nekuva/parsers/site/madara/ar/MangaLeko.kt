package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALEKO", "Manga-Leko.org", "ar")
internal class MangaLeko(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALEKO, "manga-leko.org", pageSize = 10)
