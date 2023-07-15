// FordRanger class extends the abstract class Truck
public class FordRanger extends Truck {

    // Constructor to initialize the FordRanger object with the given details
    public FordRanger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a FordRanger object with specific details
    public static FordRanger createRanger() {
        return new FordRanger("Ranger", 2019, "Gasoline", 4, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the FordRanger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
