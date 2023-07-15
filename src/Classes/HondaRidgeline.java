// HondaRidgeline class extends the abstract class Truck
public class HondaRidgeline extends Truck {

    // Constructor to initialize the HondaRidgeline object with the given details
    public HondaRidgeline(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a HondaRidgeline object with specific details
    public static HondaRidgeline createRidgeline2018() {
        return new HondaRidgeline("Ridgeline", 2018, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Static method to create a HondaRidgeline object with specific details
    public static HondaRidgeline createRidgeline2017() {
        return new HondaRidgeline("Ridgeline", 2017, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Static method to create a HondaRidgeline object with specific details
    public static HondaRidgeline createRidgeline2019() {
        return new HondaRidgeline("Ridgeline", 2019, "Gasoline", 4, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the HondaRidgeline object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
