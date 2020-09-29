package com.example.demo.controller;

import com.example.demo.model.UserModel;
import com.example.demo.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TempController {

    @Autowired
    TempService tempService;

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String index() throws Exception {

        return "index";
    }

    @RequestMapping(value="/test2/{number}", method= RequestMethod.GET)
    public String index2(Model model, @PathVariable String number) throws Exception {

        model.addAttribute("number", number);

        return "index2";
    }

    @RequestMapping(value="/findUser/{no}", method= RequestMethod.GET)
    public String findUser(Model model, @PathVariable String no) throws Exception {

        UserModel userModel = tempService.findUser(no);

        model.addAttribute("userModel", userModel);

        return "index2";
    }
}
