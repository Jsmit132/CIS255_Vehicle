// ToyotaTacoma class extends the abstract class Truck
public class ToyotaTacoma extends Truck {

    // Constructor to initialize the ToyotaTacoma object with the given details
    public ToyotaTacoma(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ToyotaTacoma object with specific details
    public static ToyotaTacoma createTacoma() {
        return new ToyotaTacoma("Tacoma", 2018, "Gasoline", 4, ColorEnum.SILVER);
    }

    // Override toCSVString method to return a CSV representation of the ToyotaTacoma object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
