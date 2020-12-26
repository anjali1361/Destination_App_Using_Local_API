package com.anjali.destinationlistappusingretrofit.services

import com.anjali.destinationlistappusingretrofit.model.Destination
import retrofit2.Call
import retrofit2.http.*

interface DestinationService {

    //all function to call end point url from api is declared here with proper annotation( inside which end point are specified)

    //get method having end point url as destination
    @GET("destination")
    fun getDestinationList(@QueryMap filter: HashMap<String, String>): Call<List<Destination>>

    @GET("destination/{id}")
    fun getDestination(@Path("id") id: Int): Call<Destination>

    @POST("destination")
    fun addDestination(@Body newDestination: Destination): Call<Destination>

    @FormUrlEncoded
    @PUT("destination/{id}")
    fun updateDestination(
        @Path("id") id: Int,
        @Field("city") city: String,
        @Field("description") desc: String,
        @Field("country") country: String
    ): Call<Destination>

    @DELETE("destination/{id}")
    fun deleteDestination(@Path("id") id: Int): Call<Unit>


}