// Supra class extends the abstract class Coupe
public class Supra extends Coupe {

    // Constructor to initialize the Supra object with the given details
    public Supra(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Supra object with specific details
    public static Supra createSupra() {
        return new Supra("Supra", 2021, "Gasoline", 2, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the Supra object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
