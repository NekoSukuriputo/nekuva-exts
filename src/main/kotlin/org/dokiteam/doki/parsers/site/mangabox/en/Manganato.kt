package org.dokiteam.doki.parsers.site.mangabox.en

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.config.ConfigKey
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.mangabox.MangaboxParser

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
