package com.example.movieapp.data.remote

import com.example.movieapp.data.model.MovieList
import com.example.movieapp.repository.WebService
import com.example.movieapp.util.AppConstant

class MovieDataSource(private val webService: WebService) {
    suspend fun getUpcomingMovies():MovieList{
        return webService.getUpcomingMovies(AppConstant.API_KEY)
    }

    suspend fun getTopRatedMovies():MovieList{
        return webService.getTopRatedMovies(AppConstant.API_KEY)
    }

    suspend fun getPopularMovies():MovieList{
        return webService.getPopularMovies(AppConstant.API_KEY)
    }

}