package com.ericbouchut.java.oop.sandbox.car;

import lombok.ToString;

@ToString
// The @ToString annotation (from the Lombok library) dynamically generates the totSring() method∞
public class Car {
    // ~~~~~ Attributes

    private String make;
    private String model;
    private CarPower power;
    private int distance;

    // ~~~~~ Constructors

    public Car(String make, String model, CarPower power) {
        super(); /* Call the default (no-areg) constructor */

        this.make = make;
        this.model = model;
        this.power = power;
        this.distance = 0;
    }

    public Car(String make, String model, CarPower power, int distance) {
        this(make, model, power); /* Call the 3-argument constructor */

        this.distance = distance;
    }

    // ~~~~~ Getters / Setters

    public void setDistance(int distance) {
        this.distance = distance;
    }


    // ~~~~~ Other methods

    public void sound() {
        switch(power) {
            case GASOLINE:
            case DIESEL:
                System.out.println("Vroooooooom!");
                break;
            case ELECTRICITY:
                System.out.println("sssssssiiiiiiiiiiiiiiiiii!");
                break;
            default:
                throw new AssertionError("Unexpected CarPower");
        }
    }
}
