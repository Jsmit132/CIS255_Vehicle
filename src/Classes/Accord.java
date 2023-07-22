// Accord class extends the abstract class Sedan
public class Accord extends Sedan {

    // Constructor to initialize the Accord object with the given details
    public Accord(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Accord object with specific details
    public static Accord createAccord2016() {
        return new Accord("Accord", 2016, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Static method to create a Accord object with specific details
    public static Accord createAccord2012() {
        return new Accord("Accord", 2012, "Gasoline", 2, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the Accord object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
