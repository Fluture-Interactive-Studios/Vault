package com.flutureis.vault.ui.components.carousel

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.requiredSizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Preview
@Composable
private fun Preview() {
    VaultCarousel(
        contents = listOf {
            DefaultTestCard("Text 1")
        }
    )

}

@Preview
@Composable
private fun PreviewTwo() {
    VaultCarousel(
        contents = listOf(
            {
                DefaultTestCard("Text 1")
            },
            {
                DefaultTestCard("Text 2")
            },
            {
                DefaultTestCard("Text 3")
            },
        )
    )
}

private const val CARD_WIDTH_PERCENTAGE = 0.76f

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VaultCarousel(
    modifier: Modifier = Modifier,
    lazyListState: LazyListState = rememberLazyListState(),
    contents: List<@Composable () -> Unit>,
) {
    val singleElement = contents.size == 1
    val itemWidth = LocalConfiguration.current.screenWidthDp.dp * CARD_WIDTH_PERCENTAGE

    LazyRow(
        modifier = modifier.fillMaxWidth(),
        state = lazyListState,
        flingBehavior = rememberSnapFlingBehavior(
            lazyListState = lazyListState,
        ),
        horizontalArrangement = if (singleElement) {
            Arrangement.Center
        } else {
            Arrangement.spacedBy(8.dp)
        },
        contentPadding = PaddingValues(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(contents) {
            CarouselItem(
                content = it,
                width = itemWidth
            )
        }
    }
}


@Composable
private fun CarouselItem(
    content: @Composable () -> Unit,
    width: Dp,
) {
    Box(
        modifier = Modifier
            .requiredSizeIn(minWidth = 100.dp, maxWidth = 400.dp)
            .width(width),
        contentAlignment = Alignment.Center
    ) {
        content.invoke()
    }
}

@Composable
internal fun DefaultTestCard(text: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp),
        shape = RoundedCornerShape(16.dp),
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
    }
}