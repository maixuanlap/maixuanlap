package com.demo.ss6.model;

public class Weather {
    private String DateTime;
    private int WeatherIcon;
    private Temperature Temperature;

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

    public com.demo.ss6.model.Temperature getTemperature() {
        return Temperature;
    }

    public void setTemperature(com.demo.ss6.model.Temperature temperature) {
        Temperature = temperature;
    }
}
