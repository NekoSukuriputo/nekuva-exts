package org.nekosukuriputo.nekuva.parsers.site.zeistmanga.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zeistmanga.ZeistMangaParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("NEKOSCANS", "NekoScans", "es")
internal class NekoScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.NEKOSCANS, "www.nekoscans.org")
