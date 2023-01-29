package com.flutureis.vault.data.datasource

import androidx.datastore.core.DataStore
import com.flutureis.vault.domain.entities.UserPreferences
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class LocalDataSource(private val dataStore: DataStore<UserPreferences>) {

    val bookmarkedStream: Flow<List<String>> = dataStore.data.map {
        it.favoritesMovies.toList()
    }

    suspend fun toggleMovie(movieId: String, isBookmarked: Boolean) {
        with(dataStore.data)
        {
            if (isBookmarked) {

            } else {

            }
        }
    }
}