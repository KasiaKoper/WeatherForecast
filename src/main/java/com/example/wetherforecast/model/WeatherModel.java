package com.example.wetherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data               //gettery, settery, konstruktory
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {

    @JsonProperty("base")        //tego uzywam, gdy chce, aby zmienna nazywala sie inaczej niz w pliku json,
                                        // bo czasem w pliku Json konwencja nazewnictwa moze byc inna niz w Javie
    private String base;

    @JsonProperty("main")
    private TemperatureModel temperatureModel=new TemperatureModel();


}
