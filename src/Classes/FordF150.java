// FordF150 class extends the abstract class Truck
public class FordF150 extends Truck {

    // Constructor to initialize the FordF150 object with the given details
    public FordF150(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a FordF150 object with specific details
    public static FordF150 createF150() {
        return new FordF150("F-150", 2018, "Gasoline", 2, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the FordF150 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
