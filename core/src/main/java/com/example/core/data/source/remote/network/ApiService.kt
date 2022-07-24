package com.example.core.data.source.remote.network

import com.example.core.data.source.remote.response.ListNewsResponse
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    @Headers("x-api-key: YOUR_API_KEY")
    suspend fun getList(
        @Query("country") country: String = "id",
        @Query("category") category: String = "technology",
        @Query("pageSize") pageSize: Int = 100
    ): ListNewsResponse
}