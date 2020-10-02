package com.example.demo.controller;

import com.example.demo.model.CurrentCovidModel;
import com.example.demo.service.CovidService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/covid")
public class CovidController {
    CovidService mCovidService;
    public CovidController(CovidService covidService) {
        mCovidService = covidService;
    }

    @RequestMapping(value="/{country}", method= RequestMethod.GET)
    public String getCityCovidStatus(Model model, @PathVariable String country) {
        CurrentCovidModel currentCovidModel = mCovidService.getCountryCovid(country);

        model.addAttribute("countryName", country);
        model.addAttribute("covidModel", currentCovidModel);

        return "covid";
    }
}
