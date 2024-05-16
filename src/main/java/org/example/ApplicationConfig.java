package org.example;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource(value = "classpath:application.properties")
@ComponentScan(basePackages = "org.example")

public class ApplicationConfig {
    @Bean
    public Wheel wheel() {
        return new Wheel();
    }
    @Bean
    @Scope(value = "prototype")
    public Transmition transmition(){
        return new Transmition();
    }
    @Bean
    public Engine engine(){
        return new Engine();
    }
    @Bean
    @Scope(value = "prototype")
    public Car car(){
        return new Car(wheel(), engine(), transmition(), car().getMark());
    }
}
