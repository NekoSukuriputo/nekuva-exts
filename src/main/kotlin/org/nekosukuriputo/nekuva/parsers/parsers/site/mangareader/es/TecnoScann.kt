package org.nekosukuriputo.nekuva.parsers.site.mangareader.es

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("TECNOSCANN", "TecnoScann", "es")
internal class TecnoScann(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TECNOSCANN, "tecnoscann.com", 20, 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
