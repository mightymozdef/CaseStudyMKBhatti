package com.casestudy.moez.bhatti.service;

import com.casestudy.moez.bhatti.models.Authorities;
import com.casestudy.moez.bhatti.models.Credential;
import com.casestudy.moez.bhatti.models.User;
import com.casestudy.moez.bhatti.repository.CredentialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service("credentialService")
public class CredentialService implements UserDetailsService {

    @Autowired
    CredentialRepository credentialRepository;

    public boolean addCredential(Credential credential) {
        return credentialRepository.save(credential) != null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Credential credential = credentialRepository.findByUsername(username);

        User user = credential.getUser();

        UserBuilder userBuilder = null;

        if (user != null) {
            userBuilder = org.springframework.security.core.userdetails.User.withUsername(username);
            userBuilder.password(credential.getPassword());
            userBuilder.disabled(!credential.isEnabled());
            userBuilder.authorities(credential.getAuthorities().stream().map(Authorities::getAuthority).toArray(String[]::new));
        } else {
            throw new UsernameNotFoundException("Credentials not found!");
        }
        return userBuilder.build();

    }
}
