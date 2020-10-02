package com.example.demo.repository;

import com.example.demo.model.CurrentCovidModel;
import com.example.demo.model.CurrentWeatherModel;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Repository
public class CovidRepository {
    private WebClient webClient;
    public CurrentCovidModel getCountryCovid(String country) {
        // API URL Example
        // https://api.covid19api.com/total/dayone/country/south-africa
        webClient = WebClient.builder().build();

        String urlString = "https://api.covid19api.com/total/dayone/country/" + country;
        URI uri = UriComponentsBuilder.fromUriString(urlString)
                .build("true");

        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(CurrentCovidModel.class)
                .block();
    }
}
