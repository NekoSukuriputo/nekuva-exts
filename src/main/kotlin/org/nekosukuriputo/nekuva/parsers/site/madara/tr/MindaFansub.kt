package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@MangaSourceParser("MINDAFANSUB", "MindaFansub", "tr", ContentType.HENTAI)
internal class MindaFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MINDAFANSUB, "mindafansub.online")
