// ToyotaSupra class extends the abstract class Coupe
public class ToyotaSupra extends Coupe {

    // Constructor to initialize the ToyotaSupra object with the given details
    public ToyotaSupra(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaSupra object with specific details
    public static ToyotaSupra createSupra() {
        return new ToyotaSupra("Supra", 2021, "Gasoline", 2, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaSupra object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
