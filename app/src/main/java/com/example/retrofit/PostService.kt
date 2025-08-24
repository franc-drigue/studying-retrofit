package com.example.retrofit

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface PostService {
    // gerenciado pelo o retrofit
    @GET("posts")
    fun list(): Call<List<PostEntity>>

    // Gerenciamento manual utilizando corrotinas
    @GET("posts")
    suspend fun listCoroutine(): Response<List<PostEntity>>
}