// HondaAccord class extends the abstract class Sedan
public class HondaAccord extends Sedan {

    // Constructor to initialize the HondaAccord object with the given details
    public HondaAccord(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a HondaAccord object with specific details
    public static HondaAccord createAccord2016() {
        return new HondaAccord("Accord", 2016, "Gasoline", 4, ColorEnum.GRAY);
    }

    // Static method to create a HondaAccord object with specific details
    public static HondaAccord createAccord2012() {
        return new HondaAccord("Accord", 2012, "Gasoline", 2, ColorEnum.RED);
    }

    // Override toCSVString method to return a CSV representation of the HondaAccord object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
