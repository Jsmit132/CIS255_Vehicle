// Challenger class extends the abstract class Coupe
public class Challenger extends Coupe {
    // Constructor to initialize the Challenger object with the given details
    public Challenger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Coupe", model, year, fuelType, numberOfDoors, color);
    }
   
    // Static method to create a Challenger object for the year 2019 with specific details
    public static Challenger createChallenger2019() {
        return new Challenger("Challenger", 2019, "Gasoline", 2, ColorEnum.WHITE);
    }
   
    // Static method to create a Challenger object for the year 2020 with specific details
    public static Challenger createChallenger2020() {
        return new Challenger("Challenger", 2020, "Gasoline", 2, ColorEnum.BLACK);
    }
   
    // Static method to create a Challenger object for the year 2021 with specific details
    public static Challenger createChallenger2021() {
        return new Challenger("Challenger", 2021, "Gasoline", 2, ColorEnum.GRAY);
    }
   
    // Override toCSVString method excel representation of the Challenger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }

}
