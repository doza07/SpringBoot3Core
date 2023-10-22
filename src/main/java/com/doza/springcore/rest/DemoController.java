package com.doza.springcore.rest;

import com.doza.springcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach coachOne;


    @Autowired
    public void setMyCoach(@Qualifier("swimCoach") Coach myCoachOne){
        this.coachOne = myCoachOne;
        System.out.println("Create bean: " + getClass().getSimpleName());
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coachOne.getDailyWorkout();
    }

}
