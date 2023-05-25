package com.example.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameSettings(
    val maxSumValue: Int,
    val minCountOfAnswers: Int,
    val minPercentOfAnswers: Int,
    val gameTimeInSeconds: Int
) : Parcelable
