package com.aleksandrmodestov.math_game_app_kotlin.domain.entities

data class GameResult(
    val hasWon: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)
