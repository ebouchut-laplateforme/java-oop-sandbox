package com.ericbouchut.java.oop.sandbox;

public class Main {
    public static void main(String[] args) {
        testCar();
        testRectangle();
    }

    public static void testCar() {
        Car myCar = new Car("Dacia", "Sandero", CarPower.GASOLINE);

        System.out.println(myCar);
    }

    public static void testRectangle() {
        Rectangle rectangle = new Rectangle(100, 50);

        System.out.println("rectangle(width=" + rectangle.getWidth()
            + ", height=" + rectangle.getHeight() + ")"
        );

    }
}