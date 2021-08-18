package com.tts.weatherapp.Service;

import com.tts.weatherapp.Model.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/*
    Our service class will handle all business logic,
    for example, if we needed to add two number, the arithmetic
    would reside in the service class
 */

@Service
public class WeatherService {

   // this annotation can pull a value from our app.properties
    @Value("${api_key}")
    private String apikey;

    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2,5/weather?zip="
                + zipCode + "&units=imperial&appid=" + apikey;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Response.class);

    }

}




