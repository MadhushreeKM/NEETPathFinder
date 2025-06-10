package com.project.neetpathfinder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.project.neetpathfinder.model.LoginResponse;

@Configuration
public class AppConfig {
    @Bean
    public LoginResponse loginResponse() {
        return new LoginResponse();
    }
}