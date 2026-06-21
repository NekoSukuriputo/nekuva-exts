package org.nekosukuriputo.nekuva.parsers.site.iken.en

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.iken.IkenParser

@MangaSourceParser("REZOSCANS", "Rezo Scans", "en")
internal class RezoScans(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.REZOSCANS, "rezoscan.org", 18, true)
