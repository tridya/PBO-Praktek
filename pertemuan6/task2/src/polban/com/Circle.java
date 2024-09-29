package polban.com;

public class Circle extends Shape {
    private double radius = 1.0;

    // No-arg constructor
    public Circle() {
    }

    // Constructor with radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with all properties
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Methods to calculate area and perimeter
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}
