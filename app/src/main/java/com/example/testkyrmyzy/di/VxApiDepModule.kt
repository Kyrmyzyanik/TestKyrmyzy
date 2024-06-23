package com.example.testkyrmyzy.di

import com.example.testkyrmyzy.data.ApiConstant
import com.example.testkyrmyzy.data.RetrofitMovieService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object VxApiDepModule {

    private const val API_KEY = "your_api_key_here" // Replace with your actual API key

    // Provides the API key interceptor
    @Provides
    @Singleton
    fun provideApiKeyInterceptor(): ApiKeyInterceptor {
        return ApiKeyInterceptor(API_KEY)
    }

    // Provides the Retrofit instance
    @Provides
    @Singleton
    fun provideRetrofit(apiKeyInterceptor: ApiKeyInterceptor): Retrofit {
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor(provideApiKeyInterceptor())
            .build()

        return Retrofit.Builder()
            .baseUrl(ApiConstant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

//    @Provides
//    @Singleton
//    fun provideRetorfit(): Retrofit {
//        return  Retrofit.Builder()
//            .baseUrl(ApiConstant.BASE_URL)
//            .addConverterFactory(GsonConverterFactory.create())
//            .client(
//                OkHttpClient.Builder()
//                .addInterceptor {apiKeyAsQuery(it)}
//                .build(),
//                )
//            .build()
//    }

    @Provides
    @Singleton
    fun provideRetorfitApi(retrofit: Retrofit): RetrofitMovieService {
        return retrofit.create(RetrofitMovieService::class.java)
    }
}

