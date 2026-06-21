package org.nekosukuriputo.nekuva.parsers.site.mangareader.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("FRANXXMANGAS", "FranxxMangas", "pt")
internal class FranxxMangas(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.FRANXXMANGAS, "franxxmangas.net", pageSize = 10, searchPageSize = 10)
