package com.casestudy.moez.bhatti.controllers;


import com.casestudy.moez.bhatti.repository.CredentialRepository;
import com.casestudy.moez.bhatti.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Admin {

    @Autowired
    CredentialRepository credentialRepository;

    @Autowired
    CredentialService credentialService;

//    @RequestMapping(value = "/login")
//    public void initAdminAcc() {
//
//        Credential credential = credentialRepository.findByUsername("moez");
//        System.out.println("WE ARE HERE ");
//        System.out.println(credential.toString());
//        if (credential == null) {
//
//            User adminUser = new User();
//            adminUser.setEmail("moezkhalid1@gmail.com");
//            adminUser.setName("Moez");
//            adminUser.setUserComments(new ArrayList<>());
//            adminUser.setUserPosts(new ArrayList<>());
//
//            Credential adminCredentials = new Credential();
//            adminCredentials.setUsername("moez");
//            adminCredentials.setPassword(new BCryptPasswordEncoder().encode("123123"));
//            adminCredentials.setUser(adminUser);
//
//            Authorities authority = new Authorities();
//            authority.setCredential(adminCredentials);
//            authority.setAuthority("ADMIN");
//
//            adminCredentials.getAuthorities().add(authority);
//
//            credentialService.addCredential(adminCredentials);
//
//        }
//    }

}
