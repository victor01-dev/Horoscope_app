package com.example.horoscapp.data.providers.network.response

import com.example.horoscapp.data.providers.network.response.motherobject.HoroscopeMotherObject.anyResponse
import io.kotest.matchers.shouldBe
import org.junit.Test

class PredictionResponseTest {

    @Test
    fun `toDomain should return a correct PredictionModel`() {
        //Given
        val horoscopeResponse = anyResponse

        //When
        val predictionModel = horoscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }
}