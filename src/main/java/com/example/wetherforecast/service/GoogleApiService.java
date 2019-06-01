package com.example.wetherforecast.service;

import com.example.wetherforecast.model.WeatherModel;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary            // gdy mamy nową klasę implementujaca interface, z ktorego robimy beana,
                    //poprzez słowko Primary dajemy znać, ktorej klasy ma używać
@Service
public class GoogleApiService implements WeatherService {

    @Override
    public WeatherModel getWeather (String city){
        return  null;
    }

}
