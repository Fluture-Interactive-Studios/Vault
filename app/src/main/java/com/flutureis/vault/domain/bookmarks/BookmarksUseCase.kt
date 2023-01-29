package com.flutureis.vault.domain.bookmarks

import com.flutureis.vault.data.repositories.BookmarksRepository
import com.flutureis.vault.data.repositories.MoviesRepository
import kotlinx.coroutines.flow.Flow

class BookmarksUseCase(private val bookmarksRepository: BookmarksRepository) {

    val bookmarkedStream: Flow<List<String>> = bookmarksRepository.bookmarkedStream

    suspend fun toggleBookmarked(movieId: String, isBookmarked: Boolean) =
        bookmarksRepository.toggleMovie(movieId, isBookmarked)
}