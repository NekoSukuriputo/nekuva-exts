package org.nekosukuriputo.nekuva.parsers.site.madara.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Cloudflare origin TLS error (5xx) — site misconfigured or dead")
@MangaSourceParser("READERGEN", "ReaderGen", "fr")
internal class Readergen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READERGEN, "fr.readergen.fr", 18)
