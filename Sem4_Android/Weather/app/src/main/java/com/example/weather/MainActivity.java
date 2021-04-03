package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weather.adapter.WeatherAdapter;
import com.example.weather.model.Temperature;
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
    List<Weather> weather;
    WeatherAdapter adapter;
    TextView tvConten,tvTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvConten = (TextView) findViewById(R.id.tvConten);
        tvTemp = (TextView) findViewById(R.id.tvTemp);
        getWeather();

        weather = new ArrayList<>();
        adapter = new WeatherAdapter(MainActivity.this,weather);
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
                if (response.body() != null){
                    weather = response.body();
                    adapter.ReloadData(weather);
                    tvConten.setText(weather.get(0).getIconPhrase());
                    tvTemp.setText(weather.get(0).getTemperature().getValue()+"\u00B0");
                }
            }
            @Override
            public void onFailure(Call<List<Weather>> call, Throwable t) {
                Toast.makeText(MainActivity.this,"FALSE",Toast.LENGTH_LONG).show();
            }
        });
    }
}