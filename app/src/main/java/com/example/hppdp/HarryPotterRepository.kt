package com.example.hppdp

class HarryPotterRepository {
    private val harryPotterService = RetrofitInstance.harryPotterService

    suspend fun getHarryPotterData(): List<HarryPotterData> {
        return harryPotterService.getData()
    }
}