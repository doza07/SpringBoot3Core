package com.doza.springcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @PostConstruct
    public void doMyPostConstruct() {
        System.out.println("Method: doMyPostConstruct: " + getClass().getSimpleName());
    }

    @PreDestroy
    public void doMyPreDestroy() {
        System.out.println("Method: doMyPreDestroy: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Class BaseballCoach, method getDailyWorkout";
    }
}
