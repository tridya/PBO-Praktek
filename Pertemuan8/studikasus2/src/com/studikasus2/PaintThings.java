package com.studikasus2;

// PaintThings.java
public class PaintThings {
    public static void main(String[] args) {
        // Create a Paint object with a coverage of 350 square feet per gallon
        Paint paint = new Paint(350);

        // Instantiate shapes
        Rectangle deck = new Rectangle(20, 35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);

        // Compute the amount of paint needed for each shape
        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        // Display results
        System.out.printf("Amount of paint needed for deck: %.2f gallons%n", deckAmount);
        System.out.printf("Amount of paint needed for big ball: %.2f gallons%n", ballAmount);
        System.out.printf("Amount of paint needed for tank: %.2f gallons%n", tankAmount);
    }
}

    