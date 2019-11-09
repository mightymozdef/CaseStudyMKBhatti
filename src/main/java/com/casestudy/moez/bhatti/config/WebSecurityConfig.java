package com.casestudy.moez.bhatti.config;


import com.casestudy.moez.bhatti.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@ComponentScan("com.casestudy.moez.bhatti")
public class WebSecurityConfig {

    @Autowired
    CredentialService credentialService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(credentialService).passwordEncoder(passwordEncoder());
//    }

    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/js/**", "/images/**", "/css/**", "/resources/**", "/scripts/**");
    }

    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/contactus/").permitAll()
                .antMatchers("/register").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/login").loginProcessingUrl("/loginAction").defaultSuccessUrl("/", true).permitAll();

    }

}
