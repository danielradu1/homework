public class Session8 {
}
//ex. 1 1. Write a Java program to create an abstract class session7.BankAccount with abstract methods deposit() and withdraw().
abstract class BankAccount {
    protected double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Abstract method to deposit money
    public abstract void deposit(double amount);

    // Abstract method to withdraw money
    public abstract void withdraw(double amount);

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// Concrete SavingsAccount class (subclass of session7.BankAccount)
class SavingsAccount extends session7.BankAccount {
    // Constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    // Implement the deposit method for SavingsAccount
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        displayBalance();
    }

    // Implement the withdraw method for SavingsAccount
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds. Withdrawal not allowed.");
        }
        displayBalance();
    }
}
//ex 2 . Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
abstract class Shape {
    // Abstract method to calculate volume
    public abstract double calculateVolume();

    // Abstract method to calculate surface area
    public abstract double calculateSurfaceArea();
}

// Concrete class Sphere (subclass of Shape3D)
class Sphere extends Shape{
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implement the calculateVolume method for Sphere
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Implement the calculateSurfaceArea method for Sphere
    @Override
    public double calculateSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 2);
    }
}
//ex 3 Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter()
abstract class GeometricShape {
    // Abstract method to calculate area
    public abstract double area();

    // Abstract method to calculate perimeter
    public abstract double perimeter();
}

// Concrete class Circle (subclass of GeometricShape)
class Circle extends GeometricShape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement the area method for Circle
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Implement the perimeter method for Circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}
//ex 4 Write a Java program to create an interface Shape with the getArea() method.

interface Shape {
    // Abstract method to get the area
    double getArea();
}

// Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing the getArea method for Circle
    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

// session7.Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing the getArea method for session7.Rectangle
    @Override
    public double getArea() {
        return length * width;
    }
}