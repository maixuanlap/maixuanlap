package com.demo.ss6.network;

import com.demo.ss6.model.Item;
import com.demo.ss6.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {

    String SERVER = "http://dataservice.accuweather.com/";

//    @GET("users/{user}/repos")
//    Call<List<Repo>> listRepos(@Path("user") String user);

    //http://google.com/api/user
    //"http://api-demo-anhth.herokuapp.com/data.json"

    @GET("data.json")
    Call<Item> getData();

    @GET("datas.json")
    Call<List<Item>> getDatas();

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=93Qg780lHwYM4SO58n7DFPLqHg4oKADn&language=vi-vn&metric=true")
    Call<List<Weather>> getWeather();

}
