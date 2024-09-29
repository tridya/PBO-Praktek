package polban.com;

public class Cylinder extends Circle { // Save as "Cylinder.java"
    private double height; // private variable

    // Constructor with default color, radius, and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle()
        height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle()
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(r)
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }

    // Overriding the getArea() method to compute the surface area of the cylinder
    @Override
    public double getArea() {
        // Surface area = 2πr(h + r)
        return 2 * Math.PI * getRadius() * (height + getRadius());
    }

    // A public method for computing the volume of the cylinder
    // Use superclass method getArea() to get the base area
    public double getVolume() {
        // Use super.getArea() to calculate the base area
        return super.getArea() * height;
    }
}
