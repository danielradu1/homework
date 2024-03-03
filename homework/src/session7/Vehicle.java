package session7;

// ex 4. Write a Java program to create a class called session7.Vehicle with a method called drive(). Create a subclass called session7.Car that overrides the drive() method to print "Driving a car".
class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    // Constructor
    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to calculate fuel efficiency
    public double calculateFuelEfficiency() {
        // Placeholder logic, actual implementation may vary
        return 20.0; // Example: 20 miles per gallon
    }

    // Method to calculate distance traveled
    public double calculateDistance(double fuelAmount) {
        // Placeholder logic, actual implementation may vary
        return calculateFuelEfficiency() * fuelAmount;
    }

    // Method to get the maximum speed
    public int getMaxSpeed() {
        // Placeholder logic, actual implementation may vary
        return 120; // Example: 120 miles per hour
    }
    // Method to drive

    public void drive() {
        System.out.println("Driving a vehicle");
    }
}
