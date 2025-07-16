package com.ericbouchut.java.oop.sandbox;

/**
 * A rectangle with 2 attributes <code>width</code> and <code>height</code>
 */
public class Rectangle {
    private int width;
    private int height;

    /**
     * Create a new instance of a Rectangle with the passed-in arguments.
     *
     * @param width the rectangle's width
     * @param height the rectangle's height
     */
    public Rectangle(int width, int height) {
        this.width  = width;
        this.height = height;
    }

    /**
     * @return the rectangle's width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the rectangle's height
     */
    public int getHeight() {
        return height;
    }
}
