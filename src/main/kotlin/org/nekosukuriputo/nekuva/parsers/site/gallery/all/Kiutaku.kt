package org.nekosukuriputo.nekuva.parsers.site.gallery.all

import okhttp3.Interceptor
import okhttp3.Response
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaSourceParser
import org.nekosukuriputo.nekuva.parsers.model.ContentType
import org.nekosukuriputo.nekuva.parsers.model.MangaParserSource
import org.nekosukuriputo.nekuva.parsers.network.CommonHeaders
import org.nekosukuriputo.nekuva.parsers.site.gallery.GalleryParser

@MangaSourceParser("KIUTAKU", "Kiutaku", type = ContentType.OTHER)
internal class Kiutaku(context: MangaLoaderContext) :
	GalleryParser(context, MangaParserSource.KIUTAKU, "kiutaku.com") {

	override fun intercept(chain: Interceptor.Chain): Response {
		val request = chain.request()
		val url = request.url.toString()

		val headers = if (url.contains("wp-content")) {
			request.headers.newBuilder()
				.removeAll(CommonHeaders.REFERER)
				.build()
		} else {
			request.headers
		}

		val newRequest = request.newBuilder()
			.headers(headers)
			.build()

		return chain.proceed(newRequest)
	}
}
