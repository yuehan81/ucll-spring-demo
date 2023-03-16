package com.springdemo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getFortune());

        Coach cricketCoach = context.getBean("myCricketCoach", Coach.class);

        System.out.println(cricketCoach.getDailyWorkout());
        System.out.println(cricketCoach.getFortune());

        context.close();
    }
}