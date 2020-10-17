package com.ryanrvldo.myreactivesearch.network

import com.ryanrvldo.myreactivesearch.BuildConfig
import com.ryanrvldo.myreactivesearch.model.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("mapbox.places/{query}.json")
    suspend fun getCountry(
        @Path("query") query: String,
        @Query("access_token") accessToken: String = BuildConfig.MAPBOX_ACCESS_TOKEN,
        @Query("autocomplete") autoComplete: Boolean = true
    ): PlaceResponse

}