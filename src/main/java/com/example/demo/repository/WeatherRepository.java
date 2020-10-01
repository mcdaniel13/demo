package com.example.demo.repository;

import com.example.demo.model.CurrentWeatherModel;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Repository
public class WeatherRepository {

    private WebClient webClient;

    public CurrentWeatherModel getWeather(String city, String apiKey) {
        // API URL Example
        // http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=${apiKey}
        webClient = WebClient.builder().build();

        URI uri = UriComponentsBuilder.fromUriString("http://api.openweathermap.org/data/2.5/weather")
                .queryParam("q", city)
                .queryParam("appid", apiKey)
                .build("true");

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(CurrentWeatherModel.class)
                .block();
    }

}