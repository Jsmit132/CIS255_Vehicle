// CRZ class extends the abstract class Coupe
public class CRZ extends Coupe {

    // Constructor to initialize the CRZ object with the given details
    public CRZ(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Honda", "Coupe", model, year, fuelType, numberOfDoors, color);
    }

    // Static method to create a CRZ object with specific details
    public static CRZ createCRZ2013() {
        return new CRZ("CR-Z", 2013, "Hybrid", 2, ColorEnum.WHITE);
    }

    // Static method to create a CRZ object with specific details
    public static CRZ createCRZ2015() {
        return new CRZ("CR-Z", 2015, "Hybrid", 2, ColorEnum.BLACK);
    }

    // Override toCSVString method to return a CSV representation of the CRZ object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
