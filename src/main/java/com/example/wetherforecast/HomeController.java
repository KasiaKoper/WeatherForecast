package com.example.wetherforecast;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    //sposob z podawaniem adresu url
//    @GetMapping("/")        //get mapping bo pobieramy (metoda get)
//    public  String home(ModelMap map){                  //Model Map gdy chcemy przesłać dane z Javy do html
//        map.put("a",20);
//        return "home";          //z pliku html ktory znajduje sie w folderze templates
//
//    }

    //spospob z wyszukiwaniem w formularzu
    @GetMapping("/")
    public String getForm(){
        return "weather";
    }


}
