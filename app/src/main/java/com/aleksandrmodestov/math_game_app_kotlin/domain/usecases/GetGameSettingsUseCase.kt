package com.aleksandrmodestov.math_game_app_kotlin.domain.usecases

import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.GameSettings
import com.aleksandrmodestov.math_game_app_kotlin.domain.entities.Level
import com.aleksandrmodestov.math_game_app_kotlin.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(
        level: Level,
    ): GameSettings {
        return repository.getGameSettings(level)
    }
}
