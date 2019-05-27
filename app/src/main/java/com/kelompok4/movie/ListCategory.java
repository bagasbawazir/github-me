package com.kelompok4.movie;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.kelompok4.movie.generator.ServiceGenerator;
import com.kelompok4.movie.model.Category;
import com.kelompok4.movie.model.CategoryList;
import com.kelompok4.movie.services.MealService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListCategory extends AppCompatActivity {

    RecyclerView recyclerView;
    CategoryAdapter categoryAdapter;
    MealService mealService;
    List<Category> categoryList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_category);

        recyclerView = findViewById(R.id.recycler_view);

        mealService = ServiceGenerator.createService(MealService.class);

        Call<CategoryList> call = mealService.getCategory();

        call.enqueue(new Callback<CategoryList>() {
            @Override
            public void onResponse(Call<CategoryList> call, Response<CategoryList> response) {
                categoryList = response.body().getCategories();

                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ListCategory.this);
                recyclerView.setLayoutManager(layoutManager);
                categoryAdapter = new CategoryAdapter(categoryList,ListCategory.this);
                //recyclerView.setAdapter(new MealAdapter(meals,R.layout.list_item_meal, getApplicationContext()));
                recyclerView.setAdapter(categoryAdapter);
            }

            @Override
            public void onFailure(Call<CategoryList> call, Throwable t) {

            }
        });

//        Call<Meal> call = service.getPostMeal(52831);


    }
}

