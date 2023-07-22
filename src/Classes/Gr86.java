// Gr86 class extends the abstract class Coupe
public class Gr86 extends Coupe {

    // Constructor to initialize the Gr86 object with the given details
    public Gr86(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Gr86 object with specific details
    public static Gr86 createGr86() {
        return new Gr86("Gr86", 2023, "Gasoline", 2, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the Gr86 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
