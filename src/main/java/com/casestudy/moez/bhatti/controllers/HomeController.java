package com.casestudy.moez.bhatti.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView getLandingPage() {
        return new ModelAndView("welcome");
    }

    @RequestMapping("/home")
    public ModelAndView getHomePage() {
        ModelAndView mav = new ModelAndView("home");
//        mav.addObject()
        return mav;
    }

}
