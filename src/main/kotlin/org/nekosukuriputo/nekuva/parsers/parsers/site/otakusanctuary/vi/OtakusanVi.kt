package org.nekosukuriputo.nekuva.parsers.site.otakusanctuary.vi

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.otakusanctuary.OtakuSanctuaryParser
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Original site closed")
@MangaSourceParser("OTAKUSAN_VI", "Otaku Sanctuary (VN)", "vi")
internal class OtakusanVi(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaParserSource.OTAKUSAN_VI, "otakusan.me") {
	override val selectState = ".table-info tr:contains(Status) td"
	override val lang = "vn"
}
