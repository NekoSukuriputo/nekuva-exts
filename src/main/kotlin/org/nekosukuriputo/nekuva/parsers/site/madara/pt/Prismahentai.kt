package org.nekosukuriputo.nekuva.parsers.site.madara.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("PRISMA_HENTAI", "PrismaHentai", "pt", ContentType.HENTAI)
internal class Prismahentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PRISMA_HENTAI, "prismahentai.com", 18)
