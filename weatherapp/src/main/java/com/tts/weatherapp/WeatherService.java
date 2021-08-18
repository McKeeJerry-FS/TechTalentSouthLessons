package com.tts.weatherapp;

import lombok.Value;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {
    @Value("${api_key}")
    private String apikey;
}
