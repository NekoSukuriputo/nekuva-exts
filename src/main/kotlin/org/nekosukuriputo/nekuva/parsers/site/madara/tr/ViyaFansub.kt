package org.nekosukuriputo.nekuva.parsers.site.madara.tr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

//Manga +18 require login.
@Broken("Domain has no DNS records — site is gone")
@MangaSourceParser("VIYAFANSUB", "ViyaFansub", "tr", ContentType.HENTAI)
internal class ViyaFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VIYAFANSUB, "viyafansub.com")