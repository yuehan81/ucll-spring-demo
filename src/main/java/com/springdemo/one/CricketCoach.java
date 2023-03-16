package com.springdemo.one;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;
    public CricketCoach() {

    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 25' on practicing cricket";
    }

    @Override
    public String getFortune() {
        return this.fortuneService.getFortune();
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
