// FordFocus class extends the abstract class Sedan
public class FordFocus extends Sedan {

    // Constructor to initialize the FordFocus object with the given details
    public FordFocus(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a FordFocus object with specific details
    public static FordFocus createFocus() {
        return new FordFocus("Focus", 2015, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Override toCSVString method to return a CSV representation of the FordFocus object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
