package com.example.weather.netWork;

import com.example.weather.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    String SERVER_URL = "http://dataservice.accuweather.com/";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=93Qg780lHwYM4SO58n7DFPLqHg4oKADn&language=vi-vn&metric=true")
    Call<List<Weather>> getWeather();
}
