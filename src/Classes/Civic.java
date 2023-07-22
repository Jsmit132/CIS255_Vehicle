// Civic class extends the abstract class Sedan
public class Civic extends Sedan {

    // Constructor to initialize the Civic object with the given details
    public Civic(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Civic object with specific details
    public static Civic createCivic2015() {
        return new Civic("Civic", 2015, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the Civic object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
