package com.doza.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class CricketCoach, Method getDailyWorkout";
    }
}
