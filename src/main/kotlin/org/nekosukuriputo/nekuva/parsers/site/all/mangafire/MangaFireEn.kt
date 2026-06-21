package org.nekosukuriputo.nekuva.parsers.site.all.mangafire

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_EN", "MangaFire English", "en")
internal class MangaFireEn(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_EN, "en")
