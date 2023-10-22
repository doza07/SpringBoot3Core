package com.doza.springcore.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class BaseballCoach, method getDailyWorkout";
    }
}
