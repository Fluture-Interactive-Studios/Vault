package com.flutureis.vault.presentation.movies

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.flutureis.vault.R
import com.flutureis.vault.domain.entities.ComponentLink

class MoviesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComponentsList()
            }
        }
    }

    @Composable
    fun ComponentsList() {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            item {
                ComponentsCard(
                    ComponentLink(
                        R.id.action_componentListFragment_to_buttonsFragment,
                        "Buttons"
                    )
                )
            }
            item {
                ComponentsCard(
                    ComponentLink(
                        R.id.action_componentListFragment_to_carouselFragment,
                        "Carousel"
                    )
                )
            }
        }
    }

    @Composable
    fun ComponentsCard(component: ComponentLink) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { navigateToComponent(component.navigationId) },
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(16.dp),
                text = component.componentName,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

        }
    }

    fun navigateToComponent(navigationId: Int) {
        findNavController().navigate(navigationId)
    }


}