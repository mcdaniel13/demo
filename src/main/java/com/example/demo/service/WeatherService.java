package com.example.demo.service;

import com.example.demo.model.CurrentWeatherModel;
import com.example.demo.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    WeatherRepository weatherRepository;

    public CurrentWeatherModel getWeather(String city) {
        return weatherRepository.getWeather(city);
    }
}
