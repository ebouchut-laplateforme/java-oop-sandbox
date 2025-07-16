package com.ericbouchut.java.oop.sandbox;

public class Car {
    private String make;
    private String model;
    private CarPower power;

    public Car(String make, String model, CarPower power) {
        this.make = make;
        this.model = model;
        this.power = power;
    }

    public String toString() {
        return "Car(make=" + this.make
                + ", model=" + this.model
                + ", power=" + this.power;
    }
}
