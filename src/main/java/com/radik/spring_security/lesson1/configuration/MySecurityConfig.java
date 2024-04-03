package com.radik.spring_security.lesson1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
public class MySecurityConfig {
    @Bean
    public InMemoryUserDetailsManager userDetailsManager(){
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("zaur")
                .password("zaur")
                .roles("EMPLOYEES")
                .build();
        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("elena")
                .password("elena")
                .roles("HR")
                .build();
        UserDetails user3 = User.withDefaultPasswordEncoder()
                .username("ivan")
                .password("ivan")
                .roles("MANAGER","HR")
                .build();
        return new InMemoryUserDetailsManager(user1,user2,user3);
    }
}
