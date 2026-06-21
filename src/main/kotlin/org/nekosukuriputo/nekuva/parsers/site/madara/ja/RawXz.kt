package org.nekosukuriputo.nekuva.parsers.site.madara.ja

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is gone — root redirects to an unrelated domain")
@MangaSourceParser("RAWXZ", "RawXz", "ja")
internal class RawXz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWXZ, "rawxz.ac") {
	override val listUrl = "jp-manga/"
}
