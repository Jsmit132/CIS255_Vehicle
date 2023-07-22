// Tundra class extends the abstract class Truck
public class Tundra extends Truck {

    // Constructor to initialize the Tundra object with the given details
    public Tundra(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Tundra object with specific details
    public static Tundra createTundraWhite() {
        return new Tundra("Tundra", 2019, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Static method to create another Tundra object with specific details
    public static Tundra createTundraBlue() {
        return new Tundra("Tundra", 2019, "Gasoline", 4, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the Tundra object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
