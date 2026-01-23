package org.dokiteam.doki.parsers.site.iken.en

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.iken.IkenParser

@MangaSourceParser("REZOSCANS", "Rezo Scans", "en")
internal class RezoScans(context: MangaLoaderContext) :
	IkenParser(context, MangaParserSource.REZOSCANS, "rezoscan.org", 18, true)
