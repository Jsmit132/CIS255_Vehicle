// DodgeAvenger class extends the abstract class Sedan
public class DodgeAvenger extends Sedan {
    
    // Constructor to initialize the DodgeAvenger object with the given details
    public DodgeAvenger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a DodgeAvenger object with specific details
    public static DodgeAvenger createAvenger() {
        return new DodgeAvenger("Avenger", 2018, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Override the toCSVString method to provide the CSV representation of the DodgeAvenger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
