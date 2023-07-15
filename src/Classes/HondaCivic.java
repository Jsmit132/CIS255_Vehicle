// HondaCivic class extends the abstract class Sedan
public class HondaCivic extends Sedan {

    // Constructor to initialize the HondaCivic object with the given details
    public HondaCivic(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a HondaCivic object with specific details
    public static HondaCivic createCivic2015() {
        return new HondaCivic("Civic", 2015, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the HondaCivic object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
