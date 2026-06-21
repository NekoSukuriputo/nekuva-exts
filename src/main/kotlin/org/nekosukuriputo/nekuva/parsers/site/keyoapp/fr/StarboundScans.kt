package org.nekosukuriputo.nekuva.parsers.site.keyoapp.fr

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.keyoapp.KeyoappParser

@Broken("Domain hijacked — now serves a JS redirect to spam/ads")
@MangaSourceParser("STARBOUNDSCANS", "StarboundScans", "fr")
internal class StarboundScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.STARBOUNDSCANS, "starboundscans.com")
