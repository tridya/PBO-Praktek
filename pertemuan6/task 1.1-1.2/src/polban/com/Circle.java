package polban.com;

public class Circle {
    // private instance variables
    private double radius;
    private String color;

    // 1st constructor (default)
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor (with given radius, default color)
    public Circle(double r) {
        radius = r;
        color = "red";
    }

    // 3rd constructor (with given radius and color)
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Override toString method for a descriptive output
    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}

