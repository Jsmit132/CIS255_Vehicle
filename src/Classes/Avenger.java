// Avenger class extends the abstract class Sedan
public class Avenger extends Sedan {
    
    // Constructor to initialize the Avenger object with the given details
    public Avenger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Avenger object with specific details
    public static Avenger createAvenger() {
        return new Avenger("Avenger", 2018, "Gasoline", 4, ColorEnum.BLACK);
    }

    // Override the toCSVString method to provide the CSV representation of the Avenger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
