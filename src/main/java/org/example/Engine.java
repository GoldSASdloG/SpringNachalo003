package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component

public class Engine {
    @Value("VOLVO")
    private String name;
    @Value("249")
    private int power;
    @Value("5")
    private int countCilinder;
    @Value("2.5")
    private double volume;

    public Engine(String name, int power, int countCilinder, double volume) {
        System.out.println("двигатель создан!");
        this.name = name;
        this.power = power;
        this.countCilinder = countCilinder;
        this.volume = volume;
        System.out.println("двигатель создан!");
    }
}
