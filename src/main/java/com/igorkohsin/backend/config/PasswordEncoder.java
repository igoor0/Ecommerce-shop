package com.igorkohsin.backend.config;

import org.springframework.context.annotation.Bean;

public class PasswordEncoder {
    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
