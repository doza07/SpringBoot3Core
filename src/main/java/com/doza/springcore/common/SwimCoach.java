package com.doza.springcore.common;

public class SwimCoach implements Coach{

    public SwimCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class SwimCoach, Method getDailyWorkout";
    }
}
