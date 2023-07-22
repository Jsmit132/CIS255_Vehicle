// F250 class extends the abstract class Truck
public class F250 extends Truck {

    // Constructor to initialize the F250 object with the given details
    public F250(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a F250 object with specific details
    public static F250 createF250() {
        return new F250("F-250", 2022, "Diesel", 2, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the F250 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
