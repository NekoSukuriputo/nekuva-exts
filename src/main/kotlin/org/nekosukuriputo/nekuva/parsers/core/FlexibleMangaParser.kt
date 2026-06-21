@file:Suppress("DEPRECATION")

package org.nekosukuriputo.nekuva.parsers.core

import androidx.annotation.CallSuper
import okhttp3.Headers
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response
import org.nekosukuriputo.nekuva.parsers.InternalParsersApi
import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext
import org.nekosukuriputo.nekuva.parsers.MangaParser
import org.nekosukuriputo.nekuva.parsers.config.ConfigKey
import org.nekosukuriputo.nekuva.parsers.config.MangaSourceConfig
import org.nekosukuriputo.nekuva.parsers.model.*
import org.nekosukuriputo.nekuva.parsers.network.CommonHeaders
import org.nekosukuriputo.nekuva.parsers.network.OkHttpWebClient
import org.nekosukuriputo.nekuva.parsers.network.WebClient
import org.nekosukuriputo.nekuva.parsers.util.*
import java.util.*

@Deprecated("Too complex. Use AbstractMangaParser instead")
internal abstract class FlexibleMangaParser @InternalParsersApi constructor(
	@property:InternalParsersApi val context: MangaLoaderContext,
	final override val source: MangaParserSource,
) : MangaParser {

	override val config: MangaSourceConfig by lazy { context.getConfig(source) }

	open val sourceLocale: Locale
		get() = if (source.locale.isEmpty()) Locale.ROOT else Locale(source.locale)

	protected open val userAgentKey: ConfigKey.UserAgent = ConfigKey.UserAgent(context.getDefaultUserAgent())

	final override val filterCapabilities: MangaListFilterCapabilities
		get() = searchQueryCapabilities.toMangaListFilterCapabilities()

	protected val sourceContentRating: ContentRating?
		get() = if (source.contentType == ContentType.HENTAI) {
			ContentRating.ADULT
		} else {
			null
		}

	final override val domain: String
		get() = config[configKeyDomain]

	@Deprecated("Override intercept() instead")
	override fun getRequestHeaders(): Headers = Headers.Builder()
		.add(CommonHeaders.USER_AGENT, config[userAgentKey])
		.build()

	/**
	 * Used as fallback if value of `order` passed to [getList] is null
	 */
	open val defaultSortOrder: SortOrder
		get() {
			val supported = availableSortOrders
			return SortOrder.entries.first { it in supported }
		}

	protected open val webClient: WebClient = OkHttpWebClient(context.httpClient, source)

	/**
	 * Fetch direct link to the page image.
	 */
	override suspend fun getPageUrl(page: MangaPage): String = page.url.toAbsoluteUrl(domain)

	final override suspend fun getList(offset: Int, order: SortOrder, filter: MangaListFilter): List<Manga> {
		return getList(convertToMangaSearchQuery(offset, order, filter))
	}

	/**
	 * Parse favicons from the main page of the source`s website
	 */
	override suspend fun getFavicons(): Favicons {
		return FaviconParser(webClient, domain).parseFavicons()
	}

	@CallSuper
	override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
		keys.add(configKeyDomain)
	}

	override suspend fun getRelatedManga(seed: Manga): List<Manga> {
		return RelatedMangaFinder(listOf(this)).invoke(seed)
	}

	/**
	 * Return [Manga] object by web link to it
	 * @see [Manga.publicUrl]
	 */
	override suspend fun resolveLink(resolver: LinkResolver, link: HttpUrl): Manga? = null

	override fun intercept(chain: Interceptor.Chain): Response = chain.proceed(chain.request())
}
