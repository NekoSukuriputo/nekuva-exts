package org.nekosukuriputo.nekuva.parsers.site.mangareader.es

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken
@MangaSourceParser("INARIMANGA", "InariManga", "es")
internal class InariManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.INARIMANGA, "clubinari.org", pageSize = 20, searchPageSize = 10) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
