package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Transmition {
    private String name;
    private int maxTransmission;

    public Transmition(String name, int maxTransmission) {
        System.out.println("трансмиссия создана!");
        this.name = name;
        this.maxTransmission = maxTransmission;
    }
}
