package com.example.wetherforecast.api;

import com.example.wetherforecast.model.WeatherModel;
import com.example.wetherforecast.service.OpenWeatherMapService;
import com.example.wetherforecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class WeatherController {

    //private WeatherService weatherService = new OpenWeatherMapService();

    @Autowired
    private WeatherService weatherService;

    //weather?city=Warsaw
    //@ResponseBody
    @GetMapping("/weather")
    public String getWeather (@RequestParam String city, ModelMap map){          //chcemy w parametrze podawac miasto
        String apiUrl="http://api.openweathermap.org/data/2.5/weather?q=" + city +",pl&appid=ef2028e98b54649bf1f4c4582631f350";

        //zeby z pliku z danymi tworzyc obiekty, musimy stworzyc klase modelową, ktora będzie pokazywać
        //jak mają wyglądać te obiekty, jak cchemy je tworzyć, tą klasą jest tu WeatherModel

        WeatherModel weatherModel=new RestTemplate().getForObject(apiUrl, WeatherModel.class);

        map.put("weather",weatherModel);
        //return weatherModel.toString();
        return "result";

    }

}
