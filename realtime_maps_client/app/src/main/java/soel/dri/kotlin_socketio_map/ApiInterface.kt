package soel.dri.kotlin_socketio_map

import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/simulate")
    fun sendCoordinates(@Body coordinates: RequestBody): Call<String>
}