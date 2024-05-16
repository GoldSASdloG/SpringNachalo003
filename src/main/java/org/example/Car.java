package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Data
@NoArgsConstructor

public class Car {
    private Wheel wheel;
    private Engine engine;
    private Transmition transmition;
    @Value("${car.mark}")
    private String mark;

    public Car(Wheel wheel, Engine engine, Transmition transmition) {
        this.wheel = wheel;
        this.engine = engine;
        this.transmition = transmition;
    }
}
