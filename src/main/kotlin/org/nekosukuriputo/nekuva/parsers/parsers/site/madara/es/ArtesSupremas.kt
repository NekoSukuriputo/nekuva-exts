package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ARTESSUPREMAS", "ArtesSupremas", "es")
internal class ArtesSupremas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARTESSUPREMAS, "artessupremas.com") {
	override val datePattern = "dd/MM/yyyy"
}
