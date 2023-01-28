package com.flutureis.vault.ui.components.textfields

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
private fun Preview() {
    val textState = remember { mutableStateOf("") }
    VaultSingleTextField(
        modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .height(200.dp),
        value = textState.value,
        onValueChange = {
            textState.value = it
        },
        placeholder = "Tell us about the problem you need help with, and special you need test.",
    )
}

@Composable
fun VaultSingleTextField(
    modifier: Modifier = Modifier,
    value: String,
    label: String? = null,
    placeholder: String? = null,
    onValueChange: (String) -> Unit
) {

}