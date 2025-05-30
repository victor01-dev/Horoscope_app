package com.example.horoscapp.ui.home.horoscope


import com.example.horoscapp.ui.home.providers.RandomCardProvider
import org.junit.Assert.*
import org.junit.Test

class RandomCardProviderTest {

    @Test
    fun `get random card should return a random card`() {
        val randomCard = RandomCardProvider()

        val card = randomCard.getLucky()

        assertNotNull(card)
    }
}