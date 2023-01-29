package com.flutureis.vault.domain.common

import com.flutureis.vault.domain.movies.SaveableMovies

sealed interface UiState {
    object Loading : UiState
    data class Success(val value: List<SaveableMovies>) : UiState
}