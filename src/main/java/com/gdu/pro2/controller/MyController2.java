package com.gdu.pro2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController2 {

  @RequestMapping(value="/board/list.do", method= RequestMethod.GET)
    public void method(){

  }

}
