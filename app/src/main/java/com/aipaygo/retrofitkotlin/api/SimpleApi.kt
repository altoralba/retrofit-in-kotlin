package com.aipaygo.retrofitkotlin.api

import com.aipaygo.retrofitkotlin.model.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post

}