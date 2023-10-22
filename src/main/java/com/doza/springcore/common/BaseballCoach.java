package com.doza.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Class BaseballCoach, method getDailyWorkout";
    }
}
