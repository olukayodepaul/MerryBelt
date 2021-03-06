package com.mobile.merrybelt.di

import com.google.gson.GsonBuilder
import com.mobile.merrybelt.BuildConfig
import com.mobile.merrybelt.datasource.RetrofitServices
import com.mobile.merrybelt.util.BasicAuthInterceptor
import com.mobile.merrybelt.util.Constants.Companion.BASE_URL
import com.mobile.merrybelt.util.Constants.Companion.BASIC_AUTH_PASSWORD
import com.mobile.merrybelt.util.Constants.Companion.BASIC_AUTH_USERNAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton


@Module
@InstallIn(ApplicationComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideApiService(): RetrofitServices {

        val supportInterceptor = BasicAuthInterceptor(BASIC_AUTH_USERNAME, BASIC_AUTH_PASSWORD)

        val okHttpClientBuilder = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .followRedirects(true)
            .followSslRedirects(true)
            .addInterceptor(supportInterceptor)

        if (BuildConfig.DEBUG) {
            val logging = HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            okHttpClientBuilder.addInterceptor(logging)
        }

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .client(okHttpClientBuilder.build())
            .build()
            .create(RetrofitServices::class.java)
    }
}