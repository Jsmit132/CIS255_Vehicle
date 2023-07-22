// Ridgeline class extends the abstract class Truck
public class Ridgeline extends Truck {

    // Constructor to initialize the Ridgeline object with the given details
    public Ridgeline(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Ridgeline object with specific details
    public static Ridgeline createRidgeline2018() {
        return new Ridgeline("Ridgeline", 2018, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Static method to create a Ridgeline object with specific details
    public static Ridgeline createRidgeline2017() {
        return new Ridgeline("Ridgeline", 2017, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Static method to create a Ridgeline object with specific details
    public static Ridgeline createRidgeline2019() {
        return new Ridgeline("Ridgeline", 2019, "Gasoline", 4, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the Ridgeline object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
