package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);

        // 1. Initial move(40, 0): Sets speed to 40, direction to 0. (Gear remains 1 implicitly)
        mercedes.move(40, 0);

        // 2. accelerate(20): New speed = 40 + 20 = 60. Gear 2 is required.
        mercedes.accelerate(20);

        // 3. accelerate(-60): New speed = 60 - 60 = 0. stop() is called. Gear 1 is set.
        mercedes.accelerate(-60);
    }
}