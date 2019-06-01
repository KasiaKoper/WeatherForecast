package com.example.wetherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data               //gettery, settery, konstruktory
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {

    @JsonProperty("base")        //tu podaje jak chce, aby zmienna sie nazywala,
                                        // bo czasem w pliku Json konwencja nazewnictwa moze byc inna niz w Javie
    private String base;



}
