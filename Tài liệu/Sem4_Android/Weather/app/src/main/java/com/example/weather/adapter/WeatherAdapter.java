package com.example.weather.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.weather.model.Weather;
import com.example.weather.R;
import android.view.LayoutInflater;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class WeatherAdapter extends RecyclerView.Adapter {
    private Activity activity;
    private List<Weather> weathers;

    public WeatherAdapter(Activity activity, List<Weather> listWeather) {
        this.activity = activity;
        this.weathers = listWeather;
    }
    public void ReloadData(List<Weather> listWeather){
        this.weathers = listWeather;
        this.notifyDataSetChanged();
    }
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View weatherView = inflater.inflate(R.layout.item_home, parent,false);
        WeatherHolder holder = new WeatherHolder(weatherView);
        return holder;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder,int position) {
        WeatherHolder hd = (WeatherHolder) holder;
        Weather model = weathers.get(position);
        hd.tvTime.setText(convertTime(model.getDateTime()));
        hd.tvValue.setText(model.getTemperature().getValue()+"");
        String url = "";
        if (model.getWeatherIcon() < 10 ){
            url = "https://developer.accuweather.com/sites/default/files/0" + model.getWeatherIcon() + "-s.png";
        }else {
            url = "https://developer.accuweather.com/sites/default/files/" + model.getWeatherIcon() + "-s.png";
        }
        Glide.with(activity).load(url).into(hd.tvIcon);
    }
    @Override
    public int getItemCount() {
        return weathers.size();
    }
    public class WeatherHolder extends RecyclerView.ViewHolder{
        TextView  tvTime, tvValue ;
        ImageView tvIcon;

        public WeatherHolder(View weatherView) {
            super(weatherView);
            tvTime = (TextView)weatherView.findViewById(R.id.tvTime);
            tvIcon= (ImageView)weatherView.findViewById(R.id.tvIcon);
            tvValue = (TextView)weatherView.findViewById(R.id.tvValue);

        }
    }
    public String convertTime(String inputTime) {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date date = null;
        try {
            date = inFormat.parse(inputTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat outFormat = new SimpleDateFormat("ha");
        String goal = outFormat.format(date);
        return goal;
    }

}