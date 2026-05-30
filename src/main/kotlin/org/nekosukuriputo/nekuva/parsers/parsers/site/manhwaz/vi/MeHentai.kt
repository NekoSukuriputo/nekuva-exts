package org.nekosukuriputo.nekuva.parsers.site.manhwaz.vi

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.manhwaz.ManhwaZ

@MangaSourceParser("MEHENTAI", "MeHentai", "vi", ContentType.HENTAI)
internal class MeHentai(context: MangaLoaderContext) :
	ManhwaZ(context, MangaParserSource.MEHENTAI, "mehentai.tv") {

	override val searchPath = "tim-kiem"
	override val tagPath = "the-loai"
}
