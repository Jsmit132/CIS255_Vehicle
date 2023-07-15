// FordTaurus class extends the abstract class Sedan
public class FordTaurus extends Sedan {

    // Constructor to initialize the FordTaurus object with the given details
    public FordTaurus(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a FordTaurus object with specific details
    public static FordTaurus createTaurus() {
        return new FordTaurus("Taurus", 2016, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the FordTaurus object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
