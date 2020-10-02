package com.example.demo.service;

import com.example.demo.model.CurrentCovidModel;
import com.example.demo.repository.CovidRepository;
import org.springframework.stereotype.Service;

@Service
public class CovidService {
    CovidRepository mCovidRepository;
    public CovidService(CovidRepository covidRepository) {
        mCovidRepository = covidRepository;
    }

    public CurrentCovidModel getCountryCovid(String country) {
        return mCovidRepository.getCountryCovid(country);
    }
}
