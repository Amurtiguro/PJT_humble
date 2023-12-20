package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/hello")
  public ModelAndView hello() {
    ModelAndView mav = new ModelAndView();
    mav.setViewName("hello");
    return mav;
  }
}
