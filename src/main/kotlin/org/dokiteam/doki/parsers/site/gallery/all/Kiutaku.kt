package org.dokiteam.doki.parsers.site.gallery.all

import okhttp3.Interceptor
import okhttp3.Response
import org.dokiteam.doki.parsers.MangaLoaderContext
import org.dokiteam.doki.parsers.MangaSourceParser
import org.dokiteam.doki.parsers.model.ContentType
import org.dokiteam.doki.parsers.model.MangaParserSource
import org.dokiteam.doki.parsers.site.gallery.GalleryParser

@MangaSourceParser("KIUTAKU", "Kiutaku", type = ContentType.OTHER)
internal class Kiutaku(context: MangaLoaderContext) :
	GalleryParser(context, MangaParserSource.KIUTAKU, "kiutaku.com") {

	override fun intercept(chain: Interceptor.Chain): Response {
		val request = chain.request()
		val url = request.url.toString()

		val headers = if (url.contains("wp-content")) {
			request.headers.newBuilder()
				.removeAll("Referer")
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
