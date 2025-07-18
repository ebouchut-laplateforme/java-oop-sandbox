package com.ericbouchut.java.oop.sandbox.inner;

import lombok.ToString;

/**
 * This class keeps a counter with the number of instances.
 */
@ToString
public class CounterBuilder {
    // ~~~~~ Class Attributes

    /**
     * Number of instances of this class
     */
    public static int instanceCounter = 0;

    // ~~~~~ Instance Attributes

    private String name;

    // ~~~~~ Constructors

    private CounterBuilder() {
        instanceCounter += 1;
    }

    public CounterBuilder(String name) {
        this();
        this.name = name;
    }

    // ~~~~~ Instance Methods

    public String getName() {
        return name;
    }
}
