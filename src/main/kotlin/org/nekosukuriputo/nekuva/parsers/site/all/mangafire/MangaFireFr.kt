package org.nekosukuriputo.nekuva.parsers.site.all.mangafire

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.all.MangaFireParser

@MangaSourceParser("MANGAFIRE_FR", "MangaFire French", "fr")
internal class MangaFireFr(context: MangaLoaderContext):
	MangaFireParser(context, MangaParserSource.MANGAFIRE_FR, "fr")
