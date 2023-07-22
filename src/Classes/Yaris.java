// Yaris class extends the abstract class Sedan
public class Yaris extends Sedan {

    // Constructor to initialize the Yaris object with the given details
    public Yaris(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Yaris object with specific details
    public static Yaris createYaris() {
        return new Yaris("Yaris", 2019, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the Yaris object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
