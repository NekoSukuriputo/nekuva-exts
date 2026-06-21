package org.nekosukuriputo.nekuva.parsers.site.guya.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.guya.GuyaParser

@MangaSourceParser("HACHIRUMI", "Hachirumi", "en", ContentType.HENTAI)
internal class Hachirumi(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.HACHIRUMI, "hachirumi.com")
