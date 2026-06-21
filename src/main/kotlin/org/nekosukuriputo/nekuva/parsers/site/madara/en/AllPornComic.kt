package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("ALLPORN_COMIC", "AllPornComic", "en", ContentType.HENTAI)
internal class AllPornComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ALLPORN_COMIC, "allporncomic.com", pageSize = 24) {
	override val tagPrefix = "porncomic-genre/"
	override val datePattern = "MMMM dd, yyyy"
}
