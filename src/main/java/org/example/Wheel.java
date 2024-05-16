package org.example;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
//@Component

public class Wheel {
    @Value("${kolesa.count}")
    private int count;
    @Value("${kolesa.value}")
    private int diametr;

    public Wheel(int count, int diametr) {
        System.out.println("колеса созданы!!!");
        this.count = count;
        this.diametr = diametr;
    }
}
