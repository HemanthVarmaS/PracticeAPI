package com.example.practiceapi.networking

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitBuilder {

    private const val BASE_URL = " https://api.dictionaryapi.dev/api/v2/entries/en_GB/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .client(provideOkHttpClient())
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    private fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient().newBuilder()
            .connectTimeout(5, TimeUnit.SECONDS)
            .readTimeout(5, TimeUnit.SECONDS).build()
    }

    val apiService: RestApiCollection = getRetrofit().create(RestApiCollection::class.java)


}