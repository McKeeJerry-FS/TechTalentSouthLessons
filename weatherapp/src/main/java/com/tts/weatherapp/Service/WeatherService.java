package com.tts.weatherapp.Service;

import com.tts.weatherapp.Model.Response;
import com.tts.weatherapp.Model.ZipCode;
import com.tts.weatherapp.Repository.ZipCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
    Our service class will handle all business logic,
    for example, if we needed to add two number, the arithmetic
    would reside in the service class
 */

@Service
public class WeatherService {

    ZipCodeRepository zipCodeRepository;
    // this annotation can pull a value from our app.properties
    @Value("${api_key}")
    private String apiKey;

    public WeatherService(ZipCodeRepository zipCodeRepository){
        this.zipCodeRepository = zipCodeRepository;
    }

    public Response getForecast(String zipCode) {
        String url = "http://api.openweathermap.org/data/2.5/weather?zip="
                + zipCode + "&units=imperial&appid=" + apiKey;
        RestTemplate restTemplate = new RestTemplate();
        try {
            zipCodeRepository.save(new ZipCode(zipCode));
            return restTemplate.getForObject(url, Response.class);
        }
        catch (HttpClientErrorException ex){
            Response response = new Response();
            response.setName("error");
            return response;
        }
    }

    public List<ZipCode> getLast10ZipCodes(){
       List<ZipCode> zipCodeList = (List<ZipCode>) zipCodeRepository.findAll();
        Collections.reverse(zipCodeList);
       return zipCodeList.stream()
               .limit(10)
               .collect(Collectors.toList());
    }

}




