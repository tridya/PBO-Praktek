package com.studikasus2;

// Cylinder.java
public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Surface area of a cylinder: 2 * PI * radius * (radius + height)
    @Override
    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }
}


