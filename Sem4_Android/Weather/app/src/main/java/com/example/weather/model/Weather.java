package com.example.weather.model;

public class Weather {
    private String DateTime;
    private int WeatherIcon;
    private Temperature Temperature;
    private String IconPhrase;

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String dateTime) {
        DateTime = dateTime;
    }

    public int getWeatherIcon() {
        return WeatherIcon;
    }

    public void setWeatherIcon(int weatherIcon) {
        WeatherIcon = weatherIcon;
    }

    public com.example.weather.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.example.weather.model.Temperature temperature) {
        Temperature = temperature;
    }

    public String getIconPhrase() {
        return IconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        IconPhrase = iconPhrase;
    }
}