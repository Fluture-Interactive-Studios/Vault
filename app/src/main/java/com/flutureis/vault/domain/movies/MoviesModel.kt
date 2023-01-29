package com.flutureis.vault.domain.movies

data class MoviesModel(
    val id: String,
    val name: String,
    val director: String,
    val url: String,
)

data class SaveableMovies(
    val movie: MoviesModel,
    val isBookmarked: Boolean,
)
