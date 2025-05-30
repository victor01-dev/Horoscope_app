package com.example.horoscapp.ui.home.horoscope

import com.example.horoscapp.data.providers.HoroscopeProvider
import com.example.horoscapp.data.providers.network.response.motherobject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue


class HoroscopeViewModelTest{

 @MockK
 lateinit var horoscopeProvider: HoroscopeProvider

 private lateinit var viewModel:HoroscopeViewModel

 @Before
 fun setUp(){
  MockKAnnotations.init(this, relaxUnitFun = true)
 }

 @Test
 fun `when viewmodel is created then horoscopes are loaded`(){
  every { horoscopeProvider.getHoroscope() } returns horoscopeInfoList
  viewModel = HoroscopeViewModel(horoscopeProvider)

  val horoscopes = viewModel.horoscope.value

  assertTrue(horoscopes.isNotEmpty())
 }
}
