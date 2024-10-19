package com.studikasus2;

// Shape.java
public abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Abstract method to calculate area
    public abstract double area();

    // toString method
    public String toString() {
        return shapeName;
    }
}




