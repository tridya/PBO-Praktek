package polban.com;

public class Square extends Rectangle {

    // Constructor with side length
    public Square(double side) {
        super(side, side); // Calls Rectangle constructor
    }

    // Constructor with side, color, and filled properties
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter and setter for side (since it's both width and length)
    public double getSide() {
        return getWidth(); // Since width = length for a square
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth and setLength to maintain square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}
