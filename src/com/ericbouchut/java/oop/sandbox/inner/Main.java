package com.ericbouchut.java.oop.sandbox.inner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initially");
        System.out.println("instances #: " + CounterBuilder.instanceCounter);
        System.out.println();

        System.out.println("Creating a new CounterBuilder named A");
        CounterBuilder aCounterBuilder = new CounterBuilder("A");
        System.out.println(aCounterBuilder);
        System.out.println("instances #: " + CounterBuilder.instanceCounter);
        System.out.println();

        System.out.println("Creating a new CounterBuilder named B");
        CounterBuilder bCounterBuilder = new CounterBuilder("B");
        System.out.println(bCounterBuilder);
        System.out.println("instances #: " + CounterBuilder.instanceCounter);
    }
}
