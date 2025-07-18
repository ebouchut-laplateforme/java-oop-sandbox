package com.ericbouchut.java.oop.sandbox.car;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Citroen", "2CV", CarPower.GASOLINE);
        myCar.setDistance(200_000);

        System.out.println(myCar);
    }
}
