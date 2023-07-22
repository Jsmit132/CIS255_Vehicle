// Fusion class extends the abstract class Coupe
public class Fusion extends Sedan {

    // Constructor to initialize the Fusion object with the given details
    public Fusion(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Fusion object with specific details
    public static Fusion createFusion() {
        return new Fusion("Fusion", 2016, "Gasoline", 2, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the Fusion object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
