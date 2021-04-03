package com.demo.ss6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.demo.ss6.model.Item;
import com.demo.ss6.network.ApiManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    TextView tvDate, tvTitle, tvContent;
    ImageView ivCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        getData();
    }

    private void initView() {
        tvDate = findViewById(R.id.tvDate);
        tvTitle = findViewById(R.id.tvTitle);
        tvContent = findViewById(R.id.tvContent);
        ivCover = findViewById(R.id.ivCover);

    }

    public void getData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManager.SERVER)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiManager service = retrofit.create(ApiManager.class);
        service.getData().enqueue(new Callback<Item>() {
            @Override
            public void onResponse(Call<Item> call, Response<Item> response) {
                Log.d("TAG", "onResponse: "+response);
                Item model = response.body();
                Log.d("TAG", "title: " + model.getTitle());
                Log.d("TAG", "date: " + model.getDate());
                Log.d("TAG", "content: " + model.getContent().getDescription());

                tvDate.setText(model.getDate());
                tvTitle.setText(model.getTitle());
                tvContent.setText(model.getContent().getDescription());
                Glide.with(MainActivity.this).load(model.getImage()).into(ivCover);

            }

            @Override
            public void onFailure(Call<Item> call, Throwable t) {
                Log.d("TAG", "onFailure: "+t);
            }
        });
    }
}