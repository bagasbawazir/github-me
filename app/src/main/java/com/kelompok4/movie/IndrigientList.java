package com.kelompok4.movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kelompok4.movie.generator.ServiceGenerator;
import com.kelompok4.movie.model.Inggridient;
import com.kelompok4.movie.model.Inggridient_;
import com.kelompok4.movie.services.MealService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class IndrigientList extends AppCompatActivity {
    RecyclerView recyclerView;
    IndrigientAdapter indrigientAdapter;
    MealService mealService;
    List<Inggridient_> ingridientList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indrigient);
        recyclerView = findViewById(R.id.recycler_view);
        mealService = ServiceGenerator.createService(MealService.class);
        Call<Inggridient> call = mealService.getIngridientList();
        call.enqueue(new Callback<Inggridient>() {
            @Override
            public void onResponse(Call<Inggridient> call, Response<Inggridient> response) {
                ingridientList = response.body().getMeals();

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(IndrigientList.this);
                recyclerView.setLayoutManager(layoutManager);
                indrigientAdapter = new IndrigientAdapter(ingridientList,IndrigientList.this);
                //recyclerView.setAdapter(new MealAdapter(meals,R.layout.list_item_meal, getApplicationContext()));
                recyclerView.setAdapter(indrigientAdapter);
            }

            @Override
            public void onFailure(Call<Inggridient> call, Throwable t) {

            }
        });
    }
}