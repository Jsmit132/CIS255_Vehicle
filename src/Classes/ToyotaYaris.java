// ToyotaYaris class extends the abstract class Sedan
public class ToyotaYaris extends Sedan {

    // Constructor to initialize the ToyotaYaris object with the given details
    public ToyotaYaris(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaYaris object with specific details
    public static ToyotaYaris createYaris() {
        return new ToyotaYaris("Yaris", 2019, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaYaris object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
