package com.aktanberdi.coursesapp.ui.theme

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResource: Int,
    val number: Int,
    @DrawableRes val drawableResource: Int
    )
