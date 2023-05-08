package com.example.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountOfAnswers: Int,
    val minPercentOfAnswers: Int,
    val gameTimeInSeconds: Int
)