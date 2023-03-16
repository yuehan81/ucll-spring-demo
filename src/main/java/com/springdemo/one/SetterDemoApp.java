package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

    public static void main(String[] args) {
        // load spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods from bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        // call methods to get literal values
        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close context
        context.close();
    }
}
