package org.nekosukuriputo.nekuva.parsers.site.mangabox.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("MANGAKAKALOT", "Mangakakalot.gg", "en")
internal class Mangakakalot(context: MangaLoaderContext) :
	MangaboxParser(context, MangaParserSource.MANGAKAKALOT) {
	override val configKeyDomain = ConfigKey.Domain("www.mangakakalot.gg")
}
