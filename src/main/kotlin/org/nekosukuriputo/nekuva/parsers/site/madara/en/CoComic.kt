package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.model.MangaTag
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("COCOMIC", "CoComic", "en", ContentType.HENTAI)
internal class CoComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COCOMIC, "cocomic.co") {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = MangaListFilterCapabilities(
			isSearchSupported = true,
		)

	override suspend fun fetchAvailableTags(): Set<MangaTag> = emptySet()
}
