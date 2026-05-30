package org.nekosukuriputo.nekuva.parsers.site.heancms.pt

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.*
import org.nekosukuriputo.nekuva.parsers.site.heancms.HeanCms

@Broken
@MangaSourceParser("MODESCANLATOR", "ModeScanlator", "pt")
internal class ModeScanlator(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.MODESCANLATOR, "site.modescanlator.net") {
	override val apiPath = "api.modescanlator.net"
}

