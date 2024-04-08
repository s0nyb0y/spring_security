package com.radik.spring_security.lesson1.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
    @Bean
    public InMemoryUserDetailsManager manager(){
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
        manager.createUser(User.withDefaultPasswordEncoder().username("zaur").password("zaur").roles("EMPLOYEES").build());
        manager.createUser(User.withDefaultPasswordEncoder().username("elena").password("elena").roles("HR").build());
        manager.createUser(User.withDefaultPasswordEncoder().username("ivan").password("ivan").roles("MANAGER").build());
        return manager;
    }
}
