package org.nekosukuriputo.nekuva.parsers.site.madara.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("KLIKMANGA", "KlikManga", "id", ContentType.HENTAI)
internal class KlikManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KLIKMANGA, "klikmanga.com", 36) {
	override val tagPrefix = "genre/"
	override val datePattern = "MMM d, yyyy"
}
