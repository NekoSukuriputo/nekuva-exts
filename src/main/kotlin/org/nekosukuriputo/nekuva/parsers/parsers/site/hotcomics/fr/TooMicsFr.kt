package org.nekosukuriputo.nekuva.parsers.site.hotcomics.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("TOOMICSFR", "TooMicsFr", "fr")
internal class TooMicsFr(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICSFR, "toomics.com/fr") {
	override val isSearchSupported = false
	override val mangasUrl = "/webtoon/ranking/genre"
	override val selectMangas = "li > div.visual"
	override val selectMangaChapters = "li.normal_ep:has(.coin-type1)"
	override val selectTagsList = "div.genre_list li:not(.on) a"
	override val selectPages = "div[id^=load_image_] img"
	override val onePage = true
}
