package com.doza.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class BaseballCoach, method getDailyWorkout";
    }
}
