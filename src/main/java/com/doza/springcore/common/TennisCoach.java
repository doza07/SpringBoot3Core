package com.doza.springcore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    public TennisCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class TennisCoach, method getDailyWorkout";
    }
}
