package com.example.horoscapp.domain.model.usecase

import com.example.horoscapp.domain.model.Repository
import javax.inject.Inject

class getPredictionUseCase @Inject constructor(private val repository: Repository){

    suspend operator fun invoke(sing:String) = repository.getPrediction(sing)

}