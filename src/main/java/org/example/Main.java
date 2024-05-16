package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
       Car car = context.getBean("car", Car.class);

       System.out.println(car);

       context.close();
    }
}
