import java.util.Scanner;

public abstract class Coupe implements IVehicle{
    public String make;
    public String type;
    public String model;
    public int year;
    public String fuelType;
    public int numberOfDoors;
    public String color;

    public Coupe(String make, String type, String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        this.make = make;
        this.type = type;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        this.numberOfDoors = numberOfDoors;
        this.color = color.getColorName();;
    }

    @Override
    public void displayDetails(String listNum) {
        System.out.println("Menu | Make       | Type       | Model      | Year | Engine Type | Door Count | Color");
        System.out.printf("%-4s | %-10s | %-10s | %-10s | %-4d | %-11s | %-10d | %-10s%n",
                listNum, make, type, model, year, fuelType, numberOfDoors, color);
    }

    @Override
    public void displayDetailsNoHead(String listNum) {
        System.out.printf("%-4s | %-10s | %-10s | %-10s | %-4d | %-11s | %-10d | %-10s%n",
                listNum, make, type, model, year, fuelType, numberOfDoors, color);
    }
}