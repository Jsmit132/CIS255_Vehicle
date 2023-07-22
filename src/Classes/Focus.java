// Focus class extends the abstract class Sedan
public class Focus extends Sedan {

    // Constructor to initialize the Focus object with the given details
    public Focus(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Focus object with specific details
    public static Focus createFocus() {
        return new Focus("Focus", 2015, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Override toCSVString method to return a CSV representation of the Focus object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
