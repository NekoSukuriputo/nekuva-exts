package org.nekosukuriputo.nekuva.parsers.site.sinmh.zh

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.sinmh.SinmhParser

@MangaSourceParser("YKMH", "Ykmh", "zh")
internal class Ykmh(context: MangaLoaderContext) :
	SinmhParser(context, MangaParserSource.YKMH, "www.ykmh.net")
