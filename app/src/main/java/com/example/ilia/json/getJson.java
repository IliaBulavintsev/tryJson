package com.example.ilia.json;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface getJson {
    @GET("community/1")
    @Headers({
            "Accept: application/json"
    })
    Call<jsonStruct> validate();
}
