// FordFusion class extends the abstract class Coupe
public class FordFusion extends Sedan {

    // Constructor to initialize the FordFusion object with the given details
    public FordFusion(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a FordFusion object with specific details
    public static FordFusion createFusion() {
        return new FordFusion("Fusion", 2016, "Gasoline", 2, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the FordFusion object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
