package org.nekosukuriputo.nekuva.parsers.site.madara.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGAOWL_US", "MangaOwlYaoi", "en", ContentType.HENTAI)
internal class MangaOwlUs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOWL_US, "mangaowlyaoi.com")
