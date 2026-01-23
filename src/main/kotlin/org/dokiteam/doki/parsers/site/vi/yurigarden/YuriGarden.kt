package org.dokiteam.doki.parsers.site.vi.yurigarden

import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.vi.YuriGardenParser

@MangaSourceParser("YURIGARDEN", "Yuri Garden", "vi")
internal class YuriGarden(context: MangaLoaderContext) :
	YuriGardenParser(context, MangaParserSource.YURIGARDEN, "yurigarden.com", false)
