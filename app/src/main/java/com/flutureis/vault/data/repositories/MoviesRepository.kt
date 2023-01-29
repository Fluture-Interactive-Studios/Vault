package com.flutureis.vault.data.repositories

import com.flutureis.vault.data.datasource.RemoteDataSource
import com.flutureis.vault.domain.movies.MoviesModel
import kotlinx.coroutines.flow.Flow

class MoviesRepository(
    private val remoteDataSource: RemoteDataSource,
) {
    val moviesStream: Flow<List<MoviesModel>> = remoteDataSource.moviesStream
}