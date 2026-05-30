package org.nekosukuriputo.nekuva.parsers.site.vmp.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.vmp.VmpParser

@MangaSourceParser("VERMANGASPORNO", "VerMangasPorno", "es", ContentType.HENTAI)
internal class VerMangasPorno(context: MangaLoaderContext) :
	VmpParser(context, MangaParserSource.VERMANGASPORNO, "vermangasporno.com")
