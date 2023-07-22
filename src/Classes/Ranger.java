// Ranger class extends the abstract class Truck
public class Ranger extends Truck {

    // Constructor to initialize the Ranger object with the given details
    public Ranger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Ranger object with specific details
    public static Ranger createRanger() {
        return new Ranger("Ranger", 2019, "Gasoline", 4, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the Ranger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
