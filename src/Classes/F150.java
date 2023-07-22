// F150 class extends the abstract class Truck
public class F150 extends Truck {

    // Constructor to initialize the F150 object with the given details
    public F150(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a F150 object with specific details
    public static F150 createF150() {
        return new F150("F-150", 2018, "Gasoline", 2, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the F150 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
