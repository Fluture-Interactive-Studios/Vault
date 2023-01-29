package com.flutureis.vault.data.datasource

import com.flutureis.vault.domain.movies.MoviesModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf


class RemoteDataSource {

    val moviesStream: Flow<List<MoviesModel>> = flowOf(listOf(MoviesModel("", "", "", "")))
}