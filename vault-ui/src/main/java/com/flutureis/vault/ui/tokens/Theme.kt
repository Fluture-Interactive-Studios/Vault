package com.flutureis.vault.ui.tokens

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

class Theme {

    @Immutable
    sealed class PrimaryTheme {

        object colorBackground : PrimaryTheme() {
            val color: Color = Colors.White
        }

        object colorText : PrimaryTheme() {
            val color: Color = Colors.Black
        }

    }

    @Immutable
    sealed class SecondaryTheme {

        object colorBackground : PrimaryTheme() {
            val color: Color = Colors.White
        }

        object colorText : PrimaryTheme() {
            val color: Color = Colors.Black
        }

    }
}