package com.studikasus2;

// Rectangle.java
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Area of a rectangle: length * width
    @Override
    public double area() {
        return length * width;
    }
}



