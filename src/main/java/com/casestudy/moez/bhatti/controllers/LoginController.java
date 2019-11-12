package com.casestudy.moez.bhatti.controllers;

import com.casestudy.moez.bhatti.models.Authorities;
import com.casestudy.moez.bhatti.models.Credential;
import com.casestudy.moez.bhatti.models.User;
import com.casestudy.moez.bhatti.repository.CredentialRepository;
import com.casestudy.moez.bhatti.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;

@Controller
public class LoginController {

    @Autowired
    CredentialService credentialService;

    @Autowired
    CredentialRepository credentialRepository;

    @RequestMapping("/register")
    public ModelAndView getSignUpPage() {
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("registrationFormObject", new Credential());
        return mav;
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public ModelAndView registerAction(@Valid @ModelAttribute("registrationFormObject") Credential credential,
                                       BindingResult br,
                                       @RequestParam("confirmPassword") String confPassword,
                                       RedirectAttributes redirect) {
        ModelAndView mav = null;
        Credential cred = credentialService.getCredentialByUsername(credential.getUsername());
//        Credential cred = credential;

        if (br.hasErrors() || credential == null) {
            br.getAllErrors().forEach(System.out::println);
            mav = new ModelAndView("register");
            mav.addObject("message", "There was an error registering your account - please try again.");
        } else {
            if (credential.getPassword().equals(confPassword)) {
                User newUser = credential.getUser();
//                newUser.setEmail(email);
                newUser.setUserPosts(new ArrayList<>());
                newUser.setUserComments(new ArrayList<>());

                cred = new Credential();
                cred.setUsername(credential.getUsername());
                cred.setPassword(new BCryptPasswordEncoder().encode(credential.getPassword()));
                cred.setUser(newUser);

                Authorities authority = new Authorities();
                authority.setAuthority("user");
                cred.getAuthorities().add(authority);
                authority.setCredential(cred);

                credentialService.addCredential(cred);
                mav = new ModelAndView("registrationConfirmation");
                mav.addObject("message", String.format("Credential successfully created for %s", cred.getUsername()));
            } else {
                redirect.addFlashAttribute("message", "Something went wrong! Please try registering again.");
                mav = new ModelAndView("redirect:/register");
            }
        }
        return mav;
    }


}
