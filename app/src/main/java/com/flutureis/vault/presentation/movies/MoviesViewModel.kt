package com.flutureis.vault.presentation.movies

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.flutureis.vault.domain.bookmarks.BookmarksUseCase
import com.flutureis.vault.domain.common.UiState
import com.flutureis.vault.domain.movies.MoviesUseCase
import com.flutureis.vault.domain.movies.SaveableMovies
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class MoviesViewModel(
    val moviesUseCase: MoviesUseCase,
    val bookmarksUseCase: BookmarksUseCase,
) : ViewModel() {

    private val combinedData: Flow<List<SaveableMovies>> = combine(
        moviesUseCase.moviesStream,
        bookmarksUseCase.bookmarkedStream
    ) { movies, bookmarks ->
        movies.map { resource ->
            val isBookmarked = bookmarks.contains(resource.id)
            SaveableMovies(resource, isBookmarked)
        }
    }

    val uiState: StateFlow<UiState> = combinedData.map { saveableMovie ->
        UiState.Success(saveableMovie)
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(stopTimeoutMillis = 5000),
        initialValue = UiState.Loading
    )

    fun toggleBookmark(moviesId: String, isBookmarked: Boolean) {
        viewModelScope.launch {
            bookmarksUseCase.toggleBookmarked(moviesId, isBookmarked)
        }
    }
}