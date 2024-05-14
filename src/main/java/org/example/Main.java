package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Car car = context.getBean("car", Car.class);
        System.out.println(car);

        Car car2 = context.getBean("car", Car.class);
        System.out.println(car2);

        System.out.println(car == car2);
        System.out.println(car.equals(car2));

        context.close();
    }
}
