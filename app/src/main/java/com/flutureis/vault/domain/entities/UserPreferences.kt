package com.flutureis.vault.domain.entities

data class UserPreferences(
    val online: Boolean,
    val favoritesMovies: List<String>,
)