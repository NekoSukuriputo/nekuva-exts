package org.nekosukuriputo.nekuva.parsers.site.keyoapp.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("LAIDBACKSCANS", "LaidBackScans", "en")
internal class LaidBackScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.LAIDBACKSCANS, "laidbackscans.org")
