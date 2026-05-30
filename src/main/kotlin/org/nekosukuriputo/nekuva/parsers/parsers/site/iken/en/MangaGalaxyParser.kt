package org.nekosukuriputo.nekuva.parsers.site.iken.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.iken.IkenParser

@Broken("Redirect to VortexScans")
@MangaSourceParser("MANGAGALAXY", "MangaGalaxy", "en")
internal class MangaGalaxyParser(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.MANGAGALAXY, "vortexscans.org", 18)
