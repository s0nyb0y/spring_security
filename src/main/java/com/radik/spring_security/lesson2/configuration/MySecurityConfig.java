package com.radik.spring_security.lesson2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

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
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/").hasAnyRole("EMPLOYEES","HR","MANAGER")
                .antMatchers("/hr_only").hasRole("HR")
                .antMatchers("/managers_only").hasRole("MANAGER")
                .and().formLogin().permitAll();
        return http.build();
    }
}
