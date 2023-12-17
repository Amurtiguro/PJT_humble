package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
 
  @GetMapping("/hello")
  public ModelAndView hello() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("hello");
    return mav;
  }
}
