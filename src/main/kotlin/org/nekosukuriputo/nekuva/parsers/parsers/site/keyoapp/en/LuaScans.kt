package org.nekosukuriputo.nekuva.parsers.site.keyoapp.en

import org.nekosukuriputo.nekuva.parsers.Broken
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.site.keyoapp.KeyoappParser

@Broken
@MangaSourceParser("LUASCANS", "luaComic.net", "en")
internal class LuaScans(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.LUASCANS, "luacomic.org")
