package org.nekosukuriputo.nekuva.parsers.site.madara.ar

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType

@MangaSourceParser("NIJITRANSLATIONS", "Niji Translations", "ar", type = ContentType.HENTAI)
internal class NijiTranslations(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIJITRANSLATIONS, "niji-translations.com") {
	override val postReq = true
}
