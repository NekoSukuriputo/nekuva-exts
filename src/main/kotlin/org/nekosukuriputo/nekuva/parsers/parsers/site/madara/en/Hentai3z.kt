package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken("Redirect to @hentai20")
@MangaSourceParser("HENTAI3Z", "Hentai3z", "en", ContentType.HENTAI)
internal class Hentai3z(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAI3Z, "manga18h.xyz", pageSize = 20) {
	override val withoutAjax = true
}
