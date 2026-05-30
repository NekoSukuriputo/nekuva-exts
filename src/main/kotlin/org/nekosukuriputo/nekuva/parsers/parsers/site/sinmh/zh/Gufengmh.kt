package org.nekosukuriputo.nekuva.parsers.site.sinmh.zh

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.sinmh.SinmhParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("GUFENGMH", "Gufengmh", "zh")
internal class Gufengmh(context: MangaLoaderContext) :
	SinmhParser(context, MangaParserSource.GUFENGMH, "www.gufengmh.com")
