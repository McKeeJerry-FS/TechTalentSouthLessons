package com.tts.weatherapp.Service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apikey;
}
