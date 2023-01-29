package com.flutureis.vault.domain.movies

import com.flutureis.vault.data.repositories.MoviesRepository
import kotlinx.coroutines.flow.Flow

class MoviesUseCase(private val moviesRepository: MoviesRepository) {
    val moviesStream: Flow<List<MoviesModel>> = moviesRepository.moviesStream
}