package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ADONISFANSUB", "AdonisFansub", "tr")
internal class AdonisFansub(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ADONISFANSUB,
		"manga.adonisfansub.com",
		pageSize = 20,
		searchPageSize = 20,
	) {

	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
