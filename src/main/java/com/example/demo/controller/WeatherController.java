package com.example.demo.controller;

import com.example.demo.model.CurrentWeatherModel;
import com.example.demo.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    // call Example
    // http://localhost:8080/weather/seoul/{apiKey}
    // http://localhost:8080/weather/london/{apiKey}
    // Calls per minute (Maximum 60, no more than)
    @RequestMapping(value="/{city}/{apiKey}", method= RequestMethod.GET)
    public String getCurrentWeather(Model model, @PathVariable String city, @PathVariable String apiKey) throws Exception {

        CurrentWeatherModel currentWeatherModel = weatherService.getWeather(city, apiKey);

        model.addAttribute("cityName", city);
        model.addAttribute("weatherModel", currentWeatherModel);

        return "weather";
    }

}