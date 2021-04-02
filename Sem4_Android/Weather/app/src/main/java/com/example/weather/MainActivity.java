package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weather.adapter.WeatherAdapter;
import com.example.weather.model.Weather;
import com.example.weather.netWork.ApiManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvNews;
    List<Weather> weathers;
    WeatherAdapter adapter;
    TextView tvStatus,tvTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWeather();

        tvStatus = findViewById(R.id.tvStatus);
        tvTemp = findViewById(R.id.tvTemp);
        weathers = new ArrayList<>();
        adapter = new WeatherAdapter(MainActivity.this,weathers);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        rvNews = findViewById(R.id.rvList);
        rvNews.setLayoutManager(layoutManager);
        rvNews.setAdapter(adapter);
    }
    private void getWeather(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiManager.SERVER_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiManager service = retrofit.create(ApiManager.class);

        service.getWeather().enqueue(new Callback<List<Weather>>() {
            @Override
            public void onResponse(Call<List<Weather>> call, Response<List<Weather>> response) {
                if(response.body() != null){
                    weathers = response.body();
                    adapter.ReloadData(weathers);
                    tvStatus.setText(weathers.get(0).getWeatherIcon());
                    tvTemp.setText(String.valueOf((int) weathers.get(0).getTemperature().getValue()) + "\u00B0");
                }

            }
            @Override
            public void onFailure(Call<List<Weather>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"Fail",Toast.LENGTH_LONG).show();
            }
        });
    }
}