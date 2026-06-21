package org.nekosukuriputo.nekuva.parsers.site.mangareader.tr

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite")
@MangaSourceParser("ROBINMANGA", "RobinManga", "tr")
internal class RobinManga(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ROBINMANGA,
		"www.guildknives.com",
		pageSize = 20,
		searchPageSize = 25,
	) {
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
