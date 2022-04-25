package com.mobile.merrybelt.util

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class BasicAuthInterceptor(username: String, password: String): Interceptor {

    private var credentials: String = Credentials.basic(username, password)
    //private val credentials =  "Bearer "+username

    override fun intercept(chain: Interceptor.Chain): Response {

        var request = chain.request()

        request = request.newBuilder()
            .addHeader("Accept", "Accept: application/x.school.v1+json")
            .header("Authorization", credentials)
            //.header("Authorization", credentials)
            .build()
        return chain.proceed(request)
    }
}