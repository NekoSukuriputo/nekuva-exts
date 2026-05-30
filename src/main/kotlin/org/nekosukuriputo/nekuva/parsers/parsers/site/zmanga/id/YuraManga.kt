package org.nekosukuriputo.nekuva.parsers.site.zmanga.id

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.zmanga.ZMangaParser

@Broken
@MangaSourceParser("YURAMANGA", "YuraManga", "id")
internal class YuraManga(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.YURAMANGA, "www.yuramanga.my.id")

