package com.casestudy.moez.bhatti.controllers;

import com.casestudy.moez.bhatti.models.Credential;
import com.casestudy.moez.bhatti.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@Controller
public class HomeController {

    @Autowired
    CredentialRepository credentialRepository;

    @RequestMapping("/")
    public ModelAndView getLandingPage() {
        ModelAndView mav = new ModelAndView("home");
        return mav;
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView getHomePage(Principal principal) {
        ModelAndView mav = new ModelAndView("welcome");
        Credential cred = credentialRepository.findByUsername(principal.getName());
        if (cred != null) {
            mav.addObject("credential", cred);
            mav.addObject("user", cred.getUser());
        }
        return mav;
    }

}
