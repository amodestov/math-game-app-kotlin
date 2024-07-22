package com.aleksandrmodestov.math_game_app_kotlin.domain.entities

data class Question(
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
)
