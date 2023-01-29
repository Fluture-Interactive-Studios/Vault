package com.flutureis.vault.data.repositories

import com.flutureis.vault.data.datasource.LocalDataSource
import kotlinx.coroutines.flow.Flow

class BookmarksRepository(private val localDataSource: LocalDataSource,) {
    val bookmarkedStream: Flow<List<String>> = localDataSource.bookmarkedStream

    suspend fun toggleMovie(movieId: String, isBookmarked: Boolean) =
        localDataSource.toggleMovie(movieId, isBookmarked)
}