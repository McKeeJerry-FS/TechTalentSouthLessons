package com.tts.weatherapp.Controller;

import com.tts.weatherapp.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WeatherController {

    @Autowired
    public WeatherService weatherService;




}
