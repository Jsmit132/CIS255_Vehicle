// ModelY class extends the abstract class Sedan
public class ModelY extends Sedan {

    // Constructor to initialize the ModelY object with the given details
    public ModelY(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Tesla", "Sedan", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a ModelY object with specific details
    public static ModelY createModelY_2021() {
        return new ModelY("Model Y", 2021, "Electric", 4, ColorEnum.WHITE);
    }

    public static ModelY createModelY_2020() {
        return new ModelY("Model Y", 2020, "Electric", 4, ColorEnum.BLUE);
    }

    public static ModelY createModelY_2022() {
        return new ModelY("Model Y", 2022, "Electric", 4, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the ModelY object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
