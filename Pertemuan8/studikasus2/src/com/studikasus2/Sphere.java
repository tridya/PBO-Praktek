package com.studikasus2;

// Sphere.java
public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Surface area of a sphere: 4 * PI * radius^2
    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}


