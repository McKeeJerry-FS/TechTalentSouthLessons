package com.tts.weatherapp.Controller;

import com.tts.weatherapp.Model.Request;
import com.tts.weatherapp.Model.Response;
import com.tts.weatherapp.Service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {

    @Autowired
    public WeatherService weatherService;

    @GetMapping()
    public String getIndex(Model model) {
        //Response response = weatherService.getForecast("43210");
        //System.out.println(response.toString());
        model.addAttribute("request", new Request());
        model.addAttribute("searches", weatherService.getLast10ZipCodes());
        return "index";
    }

    @PostMapping
    public String postIndex(Request request, Model model){
        Response data = weatherService.getForecast(request.getZipCode());
        model.addAttribute("data", data);
        model.addAttribute("searches", weatherService.getLast10ZipCodes());
        return "index";
    }
}
