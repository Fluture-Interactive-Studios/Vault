package com.flutureis.vault.ui.components.buttons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
private fun Preview() {
    VaultOutlinedButton(
        modifier = Modifier.fillMaxWidth(),
        text = "LargeButtonSecondaryOutlined",
        enabled = true,
        onClick = {}
    )
}

@Composable
fun VaultOutlinedButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {

}