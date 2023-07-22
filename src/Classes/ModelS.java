// ModelS class extends the abstract class Sedan
public class ModelS extends Sedan {

    // Constructor to initialize the ModelS object with the given details
    public ModelS(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Tesla", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a white ModelS object for the year 2021
    public static ModelS createModelS_2021_white() {
        return new ModelS("Model S", 2021, "Electric", 4, ColorEnum.WHITE);
    }
    
    // Static method to create a blue ModelS object for the year 2021
    public static ModelS createModelS_2021_blue() {
        return new ModelS("Model S", 2021, "Electric", 4, ColorEnum.BLUE);
    }

    // Override toCSVString method to return a CSV representation of the ModelS object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
