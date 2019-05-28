package com.kelompok4.movie.api;

import com.kelompok4.apigit.model.ItemResponse;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:php+location:indonesia")
    Call<ItemResponse> getItems();

}