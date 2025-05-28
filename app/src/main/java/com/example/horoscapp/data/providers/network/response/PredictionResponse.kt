package com.example.horoscapp.data.providers.network.response

import com.example.horoscapp.domain.model.PredictionModel
import com.google.gson.annotations.SerializedName


data class PredictionResponse (
    @SerializedName ("date") val date:String,
    @SerializedName ("horoscope") val horoscope:String,
    @SerializedName ("sign") val sign:String,
) {
    fun toDomain(): PredictionModel {
        return PredictionModel(
            date = date,
            horoscope = horoscope,
            sign = sign,
        )
    }
}