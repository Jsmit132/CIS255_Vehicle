// Toyota86 class extends the abstract class Coupe
public class Eighty6 extends Coupe {

    // Constructor to initialize the Toyota86 object with the given details
    public Eighty6(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Toyota86 object with specific details
    public static Eighty6 create86() {
        return new Eighty6("86", 2019, "Gasoline", 2, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the Toyota86 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
