package com.springdemo.one;

public class TrackCoach implements Coach {


    private FortuneService fortuneService;
    public TrackCoach(FortuneService theFortuneService) {
        this.fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 20' on running!";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }
}
