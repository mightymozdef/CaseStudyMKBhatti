package com.casestudy.moez.bhatti.controllers;


import com.casestudy.moez.bhatti.models.Credential;
import com.casestudy.moez.bhatti.models.Post;
import com.casestudy.moez.bhatti.models.User;
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

    @RequestMapping(value = "/createPost", method = RequestMethod.GET)
    public ModelAndView getPostCreationPage(Principal principal) {
        ModelAndView mav = new ModelAndView("createPost");
        mav.addObject("postFormObject", new Post());
        Credential credential = credentialRepository.findByUsername(principal.getName());
        mav.addObject("user", credential.getUser());
        return mav;
    }

    @RequestMapping(value = "processPost", method = RequestMethod.POST)
    public ModelAndView processForm(@Valid @ModelAttribute("postFormObject") Post post,
                                    BindingResult br, Principal principal, RedirectAttributes redirectAttributes) {
        System.out.println("Entering post action after pressing submit on createPost form");
        ModelAndView mav = null;
        if (br.hasErrors() || post == null) {
            br.getAllErrors().forEach(System.out::println);
            redirectAttributes.addFlashAttribute("message", "There was an error creating your post - please try again.");
            mav = new ModelAndView("redirect:/createPost");
        } else {
            User postAuthor = credentialRepository.findByUsername(principal.getName()).getUser();
            Post newPost = new Post();
            newPost.setCategoryId(2);
            newPost.setPostAuthor(postAuthor);
            newPost.setContent(post.getContent());
            newPost.setTitle(post.getTitle());
            postAuthor.getUserPosts().add(newPost);
            mav = new ModelAndView("welcome");
            mav.addObject("message", "Post successfully created!");
        }
        return mav;
    }

}
