package com.doza.springcore.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Class TrackCoach, method getDailyWorkout";
    }
}
