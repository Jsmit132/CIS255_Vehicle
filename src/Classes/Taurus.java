// Taurus class extends the abstract class Sedan
public class Taurus extends Sedan {

    // Constructor to initialize the Taurus object with the given details
    public Taurus(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Taurus object with specific details
    public static Taurus createTaurus() {
        return new Taurus("Taurus", 2016, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the Taurus object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
