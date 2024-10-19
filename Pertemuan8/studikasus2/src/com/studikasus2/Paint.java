package com.studikasus2;

// Paint.java
public class Paint {
    private double coverage;

    public Paint(double coverage) {
        this.coverage = coverage;
    }

    // Compute the amount of paint required for a shape
    public double amount(Shape s) {
        System.out.println("Computing amount of paint needed for " + s);
        return s.area() / coverage;
    }
}



