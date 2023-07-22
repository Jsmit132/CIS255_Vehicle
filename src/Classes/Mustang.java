// Mustang class extends the abstract class Coupe
public class Mustang extends Coupe {

    // Constructor to initialize the Mustang object with the given details
    public Mustang(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Ford", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a Mustang object for the year 2018 with specific details
    public static Mustang createMustang2018() {
        return new Mustang("Mustang", 2018, "Gasoline", 2, ColorEnum.BLUE);
    }

    // Static method to create a Mustang object for the year 2019 with specific details
    public static Mustang createMustang2019() {
        return new Mustang("Mustang", 2019, "Gasoline", 2, ColorEnum.RED);
    }

    // Static method to create a Mustang object for the year 2020 with specific details
    public static Mustang createMustang2020() {
        return new Mustang("Mustang", 2020, "Gasoline", 2, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the Mustang object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
