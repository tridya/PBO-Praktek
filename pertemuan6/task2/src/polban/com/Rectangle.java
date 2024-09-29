package polban.com;

public class Rectangle extends Shape {
        private double width = 1.0;
        private double length = 1.0;
    
        // No-arg constructor
        public Rectangle() {
        }
    
        // Constructor with width and length
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
    
        // Constructor with all properties
        public Rectangle(double width, double length, String color, boolean filled) {
            super(color, filled);
            this.width = width;
            this.length = length;
        }
    
        // Getters and setters
        public double getWidth() {
            return width;
        }
    
        public void setWidth(double width) {
            this.width = width;
        }
    
        public double getLength() {
            return length;
        }
    
        public void setLength(double length) {
            this.length = length;
        }
    
        // Methods to calculate area and perimeter
        public double getArea() {
            return width * length;
        }
    
        public double getPerimeter() {
            return 2 * (width + length);
        }
    
        // Override toString method
        @Override
        public String toString() {
            return "A Rectangle with width=" + width + " and length=" + length +
                    ", which is a subclass of " + super.toString();
        }
    }
    