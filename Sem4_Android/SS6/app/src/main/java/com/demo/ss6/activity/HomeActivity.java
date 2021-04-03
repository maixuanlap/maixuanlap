package com.demo.ss6.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.demo.ss6.MainActivity;
import com.demo.ss6.R;
import com.demo.ss6.adapter.HomeAdapter;
import com.demo.ss6.model.Item;
import com.demo.ss6.network.ApiManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HomeActivity extends AppCompatActivity {

    RecyclerView rvNews;
    List<Item> listItem = new ArrayList<>();
    HomeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //B1: Data source
        getData();

        //B2: Layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        //B3: Adapter
        adapter = new HomeAdapter(this, listItem);

        //B4: RecyclerView
        rvNews = findViewById(R.id.rvNews);
        rvNews.setLayoutManager(layoutManager);
        rvNews.setAdapter(adapter);
    }

    public void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManager.SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiManager service = retrofit.create(ApiManager.class);
        service.getDatas().enqueue(new Callback<List<Item>>() {
            @Override
            public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {
                if (response.body() != null) {
                    listItem = response.body();
                    adapter.reloadData(listItem);

                }
            }

            @Override
            public void onFailure(Call<List<Item>> call, Throwable t) {

            }
        });
    }
}