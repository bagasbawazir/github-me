package com.kelompok4.uas.api;

import com.kelompok4.uas.model.ItemResponse;


import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/search/users?q=language:php+location:indonesia")
    Call<ItemResponse> getItems();

}