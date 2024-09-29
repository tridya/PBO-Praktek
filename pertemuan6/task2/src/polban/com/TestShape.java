package polban.com;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape class
        Shape shape1 = new Shape();
        System.out.println(shape1);
        
        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        // Test Circle class
        Circle circle1 = new Circle();
        System.out.println(circle1);
        Circle circle2 = new Circle(5.0, "yellow", true);
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());

        // Test Rectangle class
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(2.0, 3.0, "orange", false);
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        // Test Square class
        Square square1 = new Square(4.0);
        System.out.println(square1);
        square1.setSide(5.0);
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());
    }
}
