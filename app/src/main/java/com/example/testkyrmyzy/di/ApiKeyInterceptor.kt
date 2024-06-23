package com.example.testkyrmyzy.di

import com.example.testkyrmyzy.data.ApiConstant
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor(private val authToken: String)  : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()

        // Get the original URL
        val originalHttpUrl = originalRequest.url

        // Add query parameter for API key
        val urlWithApiKey = addApiKey(originalHttpUrl)

        // Create a new request with the modified URL
        val requestBuilder = originalRequest.newBuilder()
            .url(urlWithApiKey)

        val modifiedRequest = requestBuilder.build()

        // Proceed with the modified request
        return chain.proceed(modifiedRequest)
    }

    private fun addApiKey(originalHttpUrl: HttpUrl): HttpUrl {
        return originalHttpUrl.newBuilder()
            .addQueryParameter("api_key", ApiConstant.KEY)
            .build()
    }
}