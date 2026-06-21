package org.nekosukuriputo.nekuva.parsers.site.madara.ko

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("RAWDEX", "RawDex", "ko", ContentType.HENTAI)
internal class RawDex(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWDEX, "rawdex.net", 40) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
