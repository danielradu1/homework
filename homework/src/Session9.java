
ex. 2
public abstract class Shape {
    // Instance variables with protected access
    protected double side1;
    protected double side2;

    // Constructor
    public Shape(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    // Abstract method to get the area
    public abstract double getArea();

    // Abstract method to get the perimeter
    public abstract double getPerimeter();
}

// session7.Rectangle subclass
class Rectangle extends Shape {
    // Constructor for session7.Rectangle
    public Rectangle(double length, double width) {
        super(length, width);
    }

    // Override the getArea method for session7.Rectangle
    @Override
    public double getArea() {
        return side1 * side2;
    }

    // Override the getPerimeter method for session7.Rectangle
    @Override
    public double getPerimeter() {
        return 2 * (side1 + side2);
    }
}

// Circle subclass
class Circle extends Shape {
    // Constructor for Circle
    public Circle(double radius) {
        super(radius, 0); // side1 represents the radius, side2 is not used
    }

    // Override the getArea method for Circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(side1, 2);
    }

    // Override the getPerimeter method for Circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * side1;
    }
}

// session7.Main class for testing
class Main {
    public static void main(String[] args) {
        // Example with session7.Rectangle
        session7.Rectangle rectangle = new session7.Rectangle(5, 8);
        System.out.println("session7.Rectangle Area: " + rectangle.getArea());
        System.out.println("session7.Rectangle Perimeter: " + rectangle.getPerimeter());

        // Example with Circle
        Circle circle = new Circle(3);
        System.out.println("\nCircle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}