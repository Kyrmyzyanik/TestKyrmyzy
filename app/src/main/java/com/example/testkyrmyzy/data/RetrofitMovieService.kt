package com.example.testkyrmyzy.data

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RetrofitMovieService {
    @GET(ApiConstant.MOVIE_NOW_PLAYING)
    suspend fun getNowPlayingMovies(
        @Query("page") page: Int = 1,
        @Query("include_adult") includeAdult: Boolean = false,
    ): MovieResponseDto

    @GET(ApiConstant.MOVIE_TOP_RATED)
    suspend fun getTopRatedMovies(
        @Query("page") page: Int = 1,
        @Query("include_adult") includeAdult: Boolean = false,
    ): MovieResponseDto
}