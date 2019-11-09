package com.casestudy.moez.bhatti.controllers;


import com.casestudy.moez.bhatti.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminController {

    @Autowired
    CredentialRepository credentialRepository;

    
}
