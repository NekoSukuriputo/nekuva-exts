package org.nekosukuriputo.nekuva.parsers.site.onemanga.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("SAKAMOTODAYS", "SakamotoDays", "fr")
internal class SakamotoDays(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.SAKAMOTODAYS, "sakamotodays.fr")
