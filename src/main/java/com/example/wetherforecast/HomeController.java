package com.example.wetherforecast;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public  String home(){
        return "home";          //z pliku html ktory znajduje sie w folderze templates

    }

}
