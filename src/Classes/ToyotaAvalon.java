// ToyotaAvalon class extends the abstract class Sedan
public class ToyotaAvalon extends Sedan {

    // Constructor to initialize the ToyotaAvalon object with the given details
    public ToyotaAvalon(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaAvalon object with specific details
    public static ToyotaAvalon createAvalon() {
        return new ToyotaAvalon("Avalon", 2016, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaAvalon object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
