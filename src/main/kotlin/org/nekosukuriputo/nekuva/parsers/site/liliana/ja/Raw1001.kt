package org.nekosukuriputo.nekuva.parsers.site.liliana.ja

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.liliana.LilianaParser

@MangaSourceParser("RAW1001", "Raw1001", "ja")
internal class Raw1001(context: MangaLoaderContext) :
	LilianaParser(context, MangaParserSource.RAW1001, "raw1001.net")
