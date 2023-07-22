// Avalon class extends the abstract class Sedan
public class Avalon extends Sedan {

    // Constructor to initialize the Avalon object with the given details
    public Avalon(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Avalon object with specific details
    public static Avalon createAvalon() {
        return new Avalon("Avalon", 2016, "Gasoline", 4, ColorEnum.WHITE);
    }

    // Override toCSVString method to return a CSV representation of the Avalon object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
