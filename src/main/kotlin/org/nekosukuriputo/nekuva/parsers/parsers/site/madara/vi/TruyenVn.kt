package org.nekosukuriputo.nekuva.parsers.site.madara.vi

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("TRUYENVN", "KhoTruyen", "vi", ContentType.HENTAI)
internal class TruyenVn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TRUYENVN, "truyenvn.shop", 20) {
	override val listUrl = "truyen-tranh/"
	override val tagPrefix = "the-loai/"
	override val datePattern = "dd/MM/yyyy"
}
