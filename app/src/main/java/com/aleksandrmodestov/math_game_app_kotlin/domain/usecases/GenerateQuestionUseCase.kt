package com.aleksandrmodestov.math_game_app_kotlin.domain.usecases

import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.Question
import com.aleksandrmodestov.math_game_app_kotlin.domain.repository.GameRepository

class GenerateQuestionUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(
        maxSum: Int,
    ): Question {
        return repository.generateQuestion(maxSum, COUNT_OF_OPTIONS)
    }

    private companion object {

        private const val COUNT_OF_OPTIONS = 6
    }
}
