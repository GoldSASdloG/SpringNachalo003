package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Wheel wheel;
    private Engine engine;
    private Transmition transmition;
    @Value("VOLVO")
    private String Mark;
}
