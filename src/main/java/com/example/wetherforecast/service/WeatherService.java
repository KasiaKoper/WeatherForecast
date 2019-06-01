package com.example.wetherforecast.service;

import com.example.wetherforecast.model.WeatherModel;

public interface WeatherService {
    WeatherModel getWeather(String city);
}
