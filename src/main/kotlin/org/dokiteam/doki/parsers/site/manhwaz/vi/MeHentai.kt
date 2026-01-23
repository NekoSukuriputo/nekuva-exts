package org.dokiteam.doki.parsers.site.manhwaz.vi

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.ContentType
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.manhwaz.ManhwaZ

@MangaSourceParser("MEHENTAI", "MeHentai", "vi", ContentType.HENTAI)
internal class MeHentai(context: MangaLoaderContext) :
	ManhwaZ(context, MangaParserSource.MEHENTAI, "mehentai.tv") {

	override val searchPath = "tim-kiem"
	override val tagPath = "the-loai"
}
