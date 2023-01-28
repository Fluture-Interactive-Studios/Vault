package com.flutureis.vault.ui.components.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun Preview() {
    VaultBaseButton(
        onClick = { /*DO nothing*/ }
    ) {
        Text(text = "Test button")
    }
}


@Composable
fun VaultBaseButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    buttonColors: VaultButtonColors = VaultButtonColors(),
    borderStroke: BorderStroke? = null,
    shape: Shape = MaterialTheme.shapes.medium,
    enabled: Boolean = true,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        modifier = modifier,
        enabled = enabled,
        onClick = onClick,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            containerColor = buttonColors.backgroundColor,
            disabledContainerColor = buttonColors.disableBackgroundColor,
            contentColor = buttonColors.contentColor,
            disabledContentColor = buttonColors.disableContentColor
        ),
        border = borderStroke,
        content = content
    )
}
