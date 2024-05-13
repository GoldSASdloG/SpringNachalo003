package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("aaaaa");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}
