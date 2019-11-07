package com.casestudy.moez.bhatti.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
@ComponentScan("com.casestudy.moez.bhatti")
public class WebSecurityConfig {

//    @Autowired
//    UserDetailsService userDetailsService;
//
//    @Bean
//    public BCryptPasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }

    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/js/**", "/images/**", "/css/**", "/resources/**", "/scripts/**");
    }

}
