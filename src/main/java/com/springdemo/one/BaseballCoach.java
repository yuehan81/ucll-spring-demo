package com.springdemo.one;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }
    public String getDailyWorkout() {
        return "Spend 30' on batting practice";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }
}
