package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Engine {
    private String name;
    private int power;
    private int countCilinder;
    private double volume;

    public Engine(String name, int power, int countCilinder, double volume) {
        System.out.println("двигатель создан!");
        this.name = name;
        this.power = power;
        this.countCilinder = countCilinder;
        this.volume = volume;
    }
}
