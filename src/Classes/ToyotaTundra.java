// ToyotaTundra class extends the abstract class Truck
public class ToyotaTundra extends Truck {

    // Constructor to initialize the ToyotaTundra object with the given details
    public ToyotaTundra(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaTundra object with specific details
    public static ToyotaTundra createTundraWhite() {
        return new ToyotaTundra("Tundra", 2019, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Static method to create another ToyotaTundra object with specific details
    public static ToyotaTundra createTundraBlue() {
        return new ToyotaTundra("Tundra", 2019, "Gasoline", 4, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaTundra object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
