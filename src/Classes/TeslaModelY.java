// TeslaModelY class extends the abstract class Sedan
public class TeslaModelY extends Sedan {

    // Constructor to initialize the TeslaModelY object with the given details
    public TeslaModelY(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Tesla", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a TeslaModelY object with specific details
    public static TeslaModelY createModelY_2021() {
        return new TeslaModelY("Model Y", 2021, "Electric", 4, ColorEnum.WHITE);
    }

    public static TeslaModelY createModelY_2020() {
        return new TeslaModelY("Model Y", 2020, "Electric", 4, ColorEnum.BLUE);
    }

    public static TeslaModelY createModelY_2022() {
        return new TeslaModelY("Model Y", 2022, "Electric", 4, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the TeslaModelY object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
