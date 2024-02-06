package com.example.hppdp

import retrofit2.http.GET

interface HarryPotterService {

    @GET("characters")
    suspend fun getData(): List<HarryPotterData>
}