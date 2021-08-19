package com.aipaygo.retrofitkotlin.repository

import com.aipaygo.retrofitkotlin.api.RetrofitInstance
import com.aipaygo.retrofitkotlin.model.Post

class Repo {

    suspend fun getPost(): Post {
        return RetrofitInstance.api.getPost()
    }

}