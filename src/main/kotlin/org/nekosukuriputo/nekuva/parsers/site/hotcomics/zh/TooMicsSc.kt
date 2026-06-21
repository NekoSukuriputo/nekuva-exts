package org.nekosukuriputo.nekuva.parsers.site.hotcomics.zh

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("TOOMICSSC", "TooMicsSc", "zh")
internal class TooMicsSc(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICSSC, "toomics.com/sc") {
	override val isSearchSupported = false
	override val mangasUrl = "/webtoon/ranking/genre"
	override val selectMangas = "li > div.visual"
	override val selectMangaChapters = "li.normal_ep:has(.coin-type1)"
	override val selectTagsList = "div.genre_list li:not(.on) a"
	override val selectPages = "div[id^=load_image_] img"
	override val onePage = true
}
