package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("KISHISAN", "Kishisan", "id")
internal class Kishisan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.KISHISAN, "www.kishisan.site")
