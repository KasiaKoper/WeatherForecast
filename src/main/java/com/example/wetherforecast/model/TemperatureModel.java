package com.example.wetherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureModel {

    @JsonProperty("temp")
    private Double temperature;

    private Integer pressure;


    public Double getTemperatureInCelsius(){
        return temperature-273.15;
    }

    public String getTemperatureDescription(){
        return String.format("%.2f",getTemperatureInCelsius());
    }
}
