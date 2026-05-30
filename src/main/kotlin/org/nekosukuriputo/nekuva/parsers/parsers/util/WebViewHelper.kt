package org.nekosukuriputo.nekuva.parsers.util

import org.nekosukuriputo.nekuva.parsers.MangaLoaderContext

public class WebViewHelper(
	private val context: MangaLoaderContext,
) {

	public suspend fun getLocalStorageValue(domain: String, key: String): String? {
		return context.evaluateJs("$SCHEME_HTTPS://$domain/", "window.localStorage.getItem(\"$key\")")
	}
}
