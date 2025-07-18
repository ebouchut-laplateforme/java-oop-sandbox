package com.ericbouchut.java.oop.sandbox.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(100, 50);

        System.out.println("Display a rectangle using its getter methods");
        System.out.println("rectangle(width=" + rectangle.getWidth()
            + ", height=" + rectangle.getHeight() + ")"
        );

        System.out.println();
        System.out.println("Display rectangle with toString()");
        System.out.println(rectangle);
    }
}