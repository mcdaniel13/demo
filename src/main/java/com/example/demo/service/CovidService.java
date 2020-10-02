package com.example.demo.service;

import com.example.demo.model.CurrentCovidModel;
import com.example.demo.repository.CovidRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CovidService {
    CovidRepository mCovidRepository;
    public CovidService(CovidRepository covidRepository) {
        mCovidRepository = covidRepository;
    }

    @Cacheable(value="CovidCache")
    public List<CurrentCovidModel> getCountryCovid(String country) {
        return mCovidRepository.getCountryCovid(country);
    }
}
