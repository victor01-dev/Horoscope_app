package com.example.horoscapp.data.providers.network.response

import android.util.Log
import com.example.horoscapp.data.providers.network.HoroscopeApiService
import com.example.horoscapp.domain.model.PredictionModel
import com.example.horoscapp.domain.model.Repository
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sign: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("Victor", "Ha ocurrido un error ${it.message}") }

        return null
    }
}