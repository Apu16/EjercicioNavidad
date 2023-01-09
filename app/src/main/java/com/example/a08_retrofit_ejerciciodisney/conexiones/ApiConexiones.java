package com.example.a08_retrofit_ejerciciodisney.conexiones;

import com.example.a08_retrofit_ejerciciodisney.modelos.Personaje;
import com.example.a08_retrofit_ejerciciodisney.modelos.Respuesta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiConexiones {

    //Obtener los datos inciales
    @GET("/characters")
    Call<Respuesta> getPersonajes();


    //Obtener un personaje
    @GET("/characters/{id}")
    Call<Personaje> getPersonaje(@Path("id") String id);

    //Obtener una página en concreto
    @GET("/characters?")
    Call<Respuesta> getPage(@Query("page") String page);

}
