package org.nekosukuriputo.nekuva.parsers.site.mangareader.pt

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("DISKUSSCAN", "DiskusScan", "pt")
internal class DiskusScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DISKUSSCAN, "diskusscan.online", pageSize = 20, searchPageSize = 10)
