package com.example.quiz_figa.App
import com.example.quiz_figa.Model.MahasiswaModel
import com.example.quiz_figa.Model.ResponModel
import retrofit2.Call
import retrofit2.http.*
interface ApiService {
    @FormUrlEncoded
    @POST("mahasiswa/save")
    fun saveBarang(
        @Body data: MahasiswaModel,
    ):Call<ResponModel>
    @GET("mahasiswa")
    fun getMahasiswa():Call<ResponModel>
}

