package com.example.mostpopular
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url
interface ApiService {
    @GET
    suspend fun getResponse(@Url url: String): Response<Respuesta>
}