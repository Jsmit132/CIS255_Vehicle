import java.util.Scanner;

// Sedan vehicle
public abstract class Sedan implements IVehicle {
    public String make;            // The make of the vehicle
    public String type;            // The type of the vehicle
    public String model;           // The model of the vehicle
    public int year;               // The year the vehicle
    public String fuelType;        // The fuelType/engineType for the vehicle
    public int numberOfDoors;      // The number of doors
    public String color;           // The color of the vehicle, represented by a ColorEnum value

    // Constructor to initialize the Sedan object with the given details
    public Sedan(String make, String type, String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        this.make = make;
        this.type = type;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.color = color.getColorName(); // Get the color name from the ColorEnum and store it
    }

    // Method to display the details of the Sedan with a header
    @Override
    public void displayDetails(String listNum) {
        System.out.println("Menu | Make       | Type       | Model      | Year | Engine Type | Door Count | Color");
        System.out.printf("%-4s | %-10s | %-10s | %-10s | %-4d | %-11s | %-10d | %-10s%n",
                listNum, make, type, model, year, fuelType, numberOfDoors, color);
    }

    // Method to display the details of the Sedan without a header
    @Override
    public void displayDetailsNoHead(String listNum) {
        System.out.printf("%-4s | %-10s | %-10s | %-10s | %-4d | %-11s | %-10d | %-10s%n",
                listNum, make, type, model, year, fuelType, numberOfDoors, color);
    }
}