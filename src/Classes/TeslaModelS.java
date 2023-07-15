// TeslaModelS class extends the abstract class Sedan
public class TeslaModelS extends Sedan {

    // Constructor to initialize the TeslaModelS object with the given details
    public TeslaModelS(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Tesla", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a white TeslaModelS object for the year 2021
    public static TeslaModelS createModelS_2021_white() {
        return new TeslaModelS("Model S", 2021, "Electric", 4, ColorEnum.WHITE);
    }
    
    // Static method to create a blue TeslaModelS object for the year 2021
    public static TeslaModelS createModelS_2021_blue() {
        return new TeslaModelS("Model S", 2021, "Electric", 4, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the TeslaModelS object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
