// Tacoma class extends the abstract class Truck
public class Tacoma extends Truck {

    // Constructor to initialize the Tacoma object with the given details
    public Tacoma(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Tacoma object with specific details
    public static Tacoma createTacoma() {
        return new Tacoma("Tacoma", 2018, "Gasoline", 4, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the Tacoma object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
