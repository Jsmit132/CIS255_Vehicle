// Camry class extends the abstract class Sedan
public class Camry extends Sedan {

    // Constructor to initialize the Camry object with the given details
    public Camry(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Camry object with specific details
    public static Camry createCamry() {
        return new Camry("Camry", 2018, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Override toCSVString method to return a CSV representation of the Camry object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
