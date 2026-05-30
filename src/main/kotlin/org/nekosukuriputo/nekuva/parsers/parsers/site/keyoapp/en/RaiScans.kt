package org.nekosukuriputo.nekuva.parsers.site.keyoapp.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("RAISCANS", "KenScans", "en")
internal class RaiScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.RAISCANS, "kenscans.com")
