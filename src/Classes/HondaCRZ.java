// HondaCRZ class extends the abstract class Coupe
public class HondaCRZ extends Coupe {

    // Constructor to initialize the HondaCRZ object with the given details
    public HondaCRZ(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a HondaCRZ object with specific details
    public static HondaCRZ createCRZ2013() {
        return new HondaCRZ("CR-Z", 2013, "Hybrid", 2, ColorEnum.WHITE);
    }

    // Static method to create a HondaCRZ object with specific details
    public static HondaCRZ createCRZ2015() {
        return new HondaCRZ("CR-Z", 2015, "Hybrid", 2, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the HondaCRZ object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
