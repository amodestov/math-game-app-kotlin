package com.aleksandrmodestov.math_game_app_kotlin.domain.repository

import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.GameSettings
import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.Level
import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}
