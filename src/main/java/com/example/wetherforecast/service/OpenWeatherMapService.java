package com.example.wetherforecast.service;

import com.example.wetherforecast.model.WeatherModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service        //lub @Component
public class OpenWeatherMapService implements WeatherService {

    @Override
    public WeatherModel getWeather(String city) {
        String apiUrl = "http://api.openweathermap.org/data/2.5/weather?q=" +
                city + ",pl&appid=ef2028e98b54649bf1f4c4582631f350";
        return new RestTemplate().getForObject(apiUrl, WeatherModel.class);
    }


}