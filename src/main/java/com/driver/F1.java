package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        // Use arbitrary values for parameters which are not mentioned
        // Using standard values for an F1 car: wheels=4, doors=0, gears=7, seats=1, type="Racing"
        super(name, 4, 0, 7, isManual, "Racing", 1);
    }

    public void accelerate(int rate){
        // 1. Get current speed and calculate new speed
        int currentSpeed = getCurrentSpeed();
        int newSpeed = currentSpeed + rate;

        // Speed cannot be negative
        if (newSpeed < 0) {
            newSpeed = 0;
        }

        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        int newGear;

        if(newSpeed == 0) {
            // Stop the car, set gear as 1
            newGear = 1;
            stop(); // Calls stop() from Vehicle
        } else if (newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed <= 250) {
            newGear = 5;
        } else { // newSpeed > 250
            newGear = 6;
        }

        // 4. Change gear if necessary
        // getCurrentGear() is assumed to be defined in Car.java
        if (newGear != getCurrentGear()) {
            changeGear(newGear);
        }

        // 5. Change speed and direction if the car is moving
        if(newSpeed > 0) {
            // getCurrentDirection() is inherited from Vehicle
            changeSpeed(newSpeed, getCurrentDirection());
        }

        // Note: The private getCurrentDirection() method was removed as it is inherited.
    }
}