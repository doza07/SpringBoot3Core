package com.doza.springcore.rest;

import com.doza.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coachOne;
    private Coach coachTwo;


    @Autowired
    public void setMyCoach(@Qualifier("baseballCoach") Coach myCoachOne,
                           @Qualifier("baseballCoach") Coach myCoachTwo) {
        this.coachOne = myCoachOne;
        this.coachTwo = myCoachTwo;
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coachOne.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: coachOne == coachTwo, " + (coachOne ==  coachTwo);
    }

}
