package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("DECADENCESCANS", "DecadenceScans", "en", ContentType.HENTAI)
internal class DecadenceScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DECADENCESCANS, "reader.decadencescans.com", 10)
