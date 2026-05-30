package org.nekosukuriputo.nekuva.parsers.site.madara.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("TECNOPROJECTS", "TecnoProjects", "es")
internal class TecnoProjects(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TECNOPROJECTS, "tecnoprojects.xyz") {
	override val datePattern = "dd 'de' MMMM 'de' yyyy"
}
