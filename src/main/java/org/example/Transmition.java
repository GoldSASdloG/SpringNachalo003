package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
//@Component
//@Scope(value = "prototype")

public class Transmition {
    @Value("${transmition.name}")
    private String name;
    @Value("7")
    private int maxTransmission;

    public Transmition(String name, int maxTransmission) {
        System.out.println("трансмиссия создана!");
        this.name = name;
        this.maxTransmission = maxTransmission;
    }
}
