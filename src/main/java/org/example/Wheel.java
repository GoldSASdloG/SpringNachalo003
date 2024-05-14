package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Wheel {
    private int count;
    private int diametr;

    public Wheel(int count, int diametr) {
        System.out.println("колеса созданы!!!");
        this.count = count;
        this.diametr = diametr;
    }
}
