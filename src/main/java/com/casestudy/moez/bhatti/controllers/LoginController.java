package com.casestudy.moez.bhatti.controllers;

import com.casestudy.moez.bhatti.models.Credential;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class LoginController {

    @RequestMapping("/register")
    public ModelAndView getSignUpPage() {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("registrationFormObject", new Credential());
        return mav;
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public ModelAndView signupAction(@Valid @ModelAttribute("registrationFormObject") Credential credential,
                                     BindingResult br,
                                     @RequestParam("confirmPassword") String confPassword,
                                     RedirectAttributes redirect) {
        ModelAndView mav = null;
        return mav;
    }

    @RequestMapping("/login")
    public ModelAndView getLoginPage() {
        return new ModelAndView("login");
    }


}
