package org.nekosukuriputo.nekuva.parsers.site.scan.fr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.scan.ScanParser

@MangaSourceParser("SCANTRAD", "ScanTrad", "fr")
internal class ScanTrad(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.SCANTRAD, "scan-trad.com")
