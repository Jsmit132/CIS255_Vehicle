// TeslaModel3 class extends the abstract class Sedan
public class TeslaModel3 extends Sedan {

    // Constructor to initialize the TeslaModel3 object with the given details
    public TeslaModel3(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Tesla", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a TeslaModel3 object for the year 2018 with specific details
    public static TeslaModel3 createModel3_2018() {
        return new TeslaModel3("Model 3", 2018, "Electric", 4, ColorEnum.RED);
    }
    
    // Static method to create a TeslaModel3 object for the year 2023 with specific details
    public static TeslaModel3 createModel3_2023() {
        return new TeslaModel3("Model 3", 2023, "Electric", 4, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the TeslaModel3 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
