package com.doza.springcore.config;

import com.doza.springcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    SwimCoach swimCoach() {
        return new SwimCoach();
    }
}
