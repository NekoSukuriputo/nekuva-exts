package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("SARCASMSCANS", "SarcasmScans", "tr", ContentType.HENTAI)
internal class SarcasmScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SARCASMSCANS, "sarcasmscans.com", 16)
