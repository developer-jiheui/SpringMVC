package com.gdu.pro2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController1 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String method(){
        return "index";
    }
}
