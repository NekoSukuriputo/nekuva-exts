package org.nekosukuriputo.nekuva.parsers.site.keyoapp.en

import org.jsoup.nodes.Element
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.keyoapp.KeyoappParser
import org.nekosukuriputo.nekuva.parsers.util.styleValueOrNull
import org.nekosukuriputo.nekuva.parsers.util.cssUrl
import org.nekosukuriputo.nekuva.parsers.Broken

@Broken("Site is online but parser is broken — layout/API changed, needs rewrite") // It seems like the site is dead.
@MangaSourceParser("AGSCOMICS", "AgsComics", "en")
internal class AgsComics(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.AGSCOMICS, "agrcomics.com") {

	override val cover: (Element) -> String? = { div ->
		val coverDiv = div.selectFirst("div.bg-cover[style*=background-image]")
			?: div.takeIf { it.hasClass("bg-cover") && it.hasAttr("style") }
			?: div.selectFirst("[style*=background-image]")
			?: throw Exception("Element or image url not found")

		coverDiv.styleValueOrNull("background-image")?.cssUrl()
	}

}
