package org.nekosukuriputo.nekuva.parsers.site.scan.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.scan.ScanParser

@MangaSourceParser("SCANVFORG", "ScanVf.org", "fr")
internal class ScanVfOrg(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.SCANVFORG, "scanvf.org")
