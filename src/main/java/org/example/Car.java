package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Wheel wheel;
    private Engine engine;
    private Transmition transmition;
    private String Mark;
}
