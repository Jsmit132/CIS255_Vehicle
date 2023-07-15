// Toyota86 class extends the abstract class Coupe
public class Toyota86 extends Coupe {

    // Constructor to initialize the Toyota86 object with the given details
    public Toyota86(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Toyota", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Toyota86 object with specific details
    public static Toyota86 create86() {
        return new Toyota86("86", 2019, "Gasoline", 2, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the Toyota86 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
