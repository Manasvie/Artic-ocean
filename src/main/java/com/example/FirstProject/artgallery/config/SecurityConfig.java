package com.example.FirstProject.artgallery.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

//public class SecurityConfig {
//}

//@Configuration
//@EnableWebSecurity
@RestController
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll() // Landing page
                .antMatchers("/artist/**").hasRole("ARTIST") // Artist-only endpoints
                .antMatchers("/viewer/**").hasRole("VIEWER") // Viewer-only endpoints
                .anyRequest().authenticated() // Require authentication for other endpoints
                .and()
                .formLogin() // Enable form-based authentication
                .loginPage("/login") // Custom login page
                .permitAll()
                .and()
                .logout()
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication() // For demo purposes, use in-memory authentication
                .withUser("artist")
                .password(passwordEncoder().encode("password"))
                .roles("ARTIST")
                .and()
                .withUser("viewer")
                .password(passwordEncoder().encode("password"))
                .roles("VIEWER");
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}