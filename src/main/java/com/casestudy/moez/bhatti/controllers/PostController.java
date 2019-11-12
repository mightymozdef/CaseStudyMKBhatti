package com.casestudy.moez.bhatti.controllers;


import com.casestudy.moez.bhatti.models.Post;
import com.casestudy.moez.bhatti.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PostController {

    @Autowired
    CredentialRepository credentialRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        binder.registerCustomEditor(Date.class, "timestamp", new CustomDateEditor(sdf, false));
    }

    @RequestMapping("/createPost")
    public ModelAndView getPostCreationPage(Principal principal) {
        ModelAndView mav = new ModelAndView("createPost");
        mav.addObject("postFormObject", new Post());
        return mav;
    }

    @RequestMapping(value = "postAction", method = RequestMethod.POST)
    public ModelAndView processForm(@Valid @ModelAttribute("postFormObject") Post post,
                                    BindingResult br, RedirectAttributes redirect) {
        ModelAndView mav = null;

    }

}
