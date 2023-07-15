// ToyotaGr86 class extends the abstract class Coupe
public class ToyotaGr86 extends Coupe {

    // Constructor to initialize the ToyotaGr86 object with the given details
    public ToyotaGr86(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaGr86 object with specific details
    public static ToyotaGr86 createGr86() {
        return new ToyotaGr86("Gr86", 2023, "Gasoline", 2, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaGr86 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
