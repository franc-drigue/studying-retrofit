package com.example.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient private constructor() {
    companion object {
        private lateinit var instance: Retrofit
        private fun getRetrofitInstance(): Retrofit {
            val httpClint = OkHttpClient.Builder()
            synchronized(this) {
                if (!::instance.isInitialized) {
                   instance = Retrofit.Builder()
                       .client(httpClint.build())
                       .baseUrl("https://jsonplaceholder.typicode.com/")
                       .addConverterFactory(GsonConverterFactory.create())
                       .build()
                }
                return instance
            }
        }

        fun <S> createService(serviceClass: Class<S>): S {
           return getRetrofitInstance().create(serviceClass)
        }
    }
}