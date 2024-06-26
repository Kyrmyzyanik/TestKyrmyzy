package com.example.testkyrmyzy.data

import com.google.gson.annotations.SerializedName


data class MovieResponseDto(
    val page: Int,
    val results: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResult: Int,
)

data class MovieDto(
    val id: Long,
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backDropPath: String,
    @SerializedName("poster_path")
    val posterPath: String,
    @SerializedName("genre_ids")
    val genreIds: List<Int>?,
    @SerializedName("original_language")
    val originalLanguage: String,
    val title: String,
    val overview: String,
    val popularity: Double,
    @SerializedName("release_date")
    val releaseDate: String,
    val video: Boolean,
    @SerializedName("vote_average")
    val avgVote: Double,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("runtime")
    val runtime: Int,
    @SerializedName("imdb_id")
    val imdbId: String?,

    )