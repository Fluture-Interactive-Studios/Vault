package com.flutureis.vault.ui.components.buttons

import androidx.compose.ui.graphics.Color
import com.flutureis.vault.ui.tokens.Theme

data class VaultButtonColors(
    val backgroundColor: Color = Theme.PrimaryTheme.colorBackground.color,
    val disableBackgroundColor: Color = Theme.PrimaryTheme.colorText.color,
    val contentColor: Color = Theme.PrimaryTheme.colorText.color,
    val disableContentColor: Color = Theme.PrimaryTheme.colorText.color,
)
