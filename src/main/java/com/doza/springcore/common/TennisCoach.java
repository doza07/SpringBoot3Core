package com.doza.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Class TennisCoach, method getDailyWorkout";
    }
}
