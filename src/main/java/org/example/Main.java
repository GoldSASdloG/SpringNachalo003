package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Car car = context.getBean("car", Car.class);

        System.out.println(car.getEngine());
        System.out.println(car.getTransmition());
        System.out.println(car.getWheel());
        System.out.println(car.getMark());

        context.close();
    }
}
