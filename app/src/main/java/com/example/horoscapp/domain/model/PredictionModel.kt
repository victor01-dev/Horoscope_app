package com.example.horoscapp.domain.model

import com.google.gson.annotations.SerializedName

class PredictionModel(
    val date: String,
    val horoscope: String,
    val sign: String
)