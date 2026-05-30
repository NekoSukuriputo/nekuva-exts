package org.nekosukuriputo.nekuva.parsers.site.mangareader.id

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaListFilterCapabilities
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MIHENTAI", "MiHentai", "id", ContentType.HENTAI)
internal class MiHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MIHENTAI, "mihentai.com", pageSize = 30, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val selectMangaList = ".listupd .bs .bsx"
	override val filterCapabilities: MangaListFilterCapabilities
		get() = super.filterCapabilities.copy(
			isTagsExclusionSupported = false,
		)
}
