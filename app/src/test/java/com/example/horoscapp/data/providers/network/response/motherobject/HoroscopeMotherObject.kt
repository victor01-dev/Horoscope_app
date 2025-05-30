package com.example.horoscapp.data.providers.network.response.motherobject

import com.example.horoscapp.data.providers.network.response.PredictionResponse
import com.example.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.example.horoscapp.domain.model.HoroscopeInfo.Aries
import com.example.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.example.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.example.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.example.horoscapp.domain.model.HoroscopeInfo.Leo
import com.example.horoscapp.domain.model.HoroscopeInfo.Libra
import com.example.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.example.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.example.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.example.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.example.horoscapp.domain.model.HoroscopeInfo.Virgo

object HoroscopeMotherObject {

    val anyResponse = PredictionResponse("date", "prediction", "sign")

    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}