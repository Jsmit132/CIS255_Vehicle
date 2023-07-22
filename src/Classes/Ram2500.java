// Ram2500 class extends the abstract class Truck
public class Ram2500 extends Truck {

    // Constructor to initialize the Ram2500 object with the given details
    public Ram2500(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Truck", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Ram2500 object with specific details
    public static Ram2500 createRam2500() {
        return new Ram2500("Ram 2500", 2017, "Diesel", 4, ColorEnum.SILVER);
    }

    // Override the toCSVString method to provide the CSV representation of the Ram2500 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
