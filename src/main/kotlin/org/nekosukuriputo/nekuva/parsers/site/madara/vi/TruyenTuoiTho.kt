package org.nekosukuriputo.nekuva.parsers.site.madara.vi

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("TRUYENTUOITHO", "Truyện Tuổi Thơ", "vi")
internal class TruyenTuoiTho(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TRUYENTUOITHO, "truyentuoitho.com") {
	override val datePattern = "dd/MM/yyyy"
	override val withoutAjax = true
}
