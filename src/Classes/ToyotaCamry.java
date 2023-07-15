// ToyotaCamry class extends the abstract class Sedan
public class ToyotaCamry extends Sedan {

    // Constructor to initialize the ToyotaCamry object with the given details
    public ToyotaCamry(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaCamry object with specific details
    public static ToyotaCamry createCamry() {
        return new ToyotaCamry("Camry", 2018, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaCamry object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
