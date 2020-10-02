package com.example.demo.controller;

import com.example.demo.model.CurrentCovidModel;
import com.example.demo.service.CovidService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/covid")
public class CovidController {
    CovidService mCovidService;
    public CovidController(CovidService covidService) {
        mCovidService = covidService;
    }

    @RequestMapping(value="/{country}", method= RequestMethod.GET)
    public String getCityCovidStatus(Model model, @PathVariable String country) {
        List<CurrentCovidModel> currentCovidModelList = mCovidService.getCountryCovid(country);

        model.addAttribute("countryName", country);
        model.addAttribute("currentCovidModelList", currentCovidModelList);

        return "covid";
    }
}
