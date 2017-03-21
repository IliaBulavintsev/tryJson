package com.example.ilia.json;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestrofitFactory {

    public RestrofitFactory() {};

    private final static Retrofit JSON_INSTANCE = new Retrofit.Builder()
            .baseUrl("https://json-storage.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    static Retrofit retrofitJson() {
        return JSON_INSTANCE;
    }
}
