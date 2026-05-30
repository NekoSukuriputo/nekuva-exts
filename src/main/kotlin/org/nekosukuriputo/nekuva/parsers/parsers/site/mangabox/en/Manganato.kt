package org.nekosukuriputo.nekuva.parsers.site.mangabox.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("MANGANATO", "Manganato", "en")
internal class Manganato(context: MangaLoaderContext) :
	MangaboxParser(context, MangaParserSource.MANGANATO) {
	override val configKeyDomain = ConfigKey.Domain(
		"www.natomanga.com",
		"www.manganato.gg",
	)
	override val otherDomain = "www.manganato.gg"

	override val authorUrl = "/author/story"
	override val selectPage = ".container-chapter-reader > img"
}
