// DodgeChallenger class extends the abstract class Coupe
public class DodgeChallenger extends Coupe {
    // Constructor to initialize the DodgeChallenger object with the given details
    public DodgeChallenger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Coupe", model, year, fuelType, numberOfDoors, color);
    }
   
    // Static method to create a DodgeChallenger object for the year 2019 with specific details
    public static DodgeChallenger createChallenger2019() {
        return new DodgeChallenger("Challenger", 2019, "Gasoline", 2, ColorEnum.WHITE);
    }
   
    // Static method to create a DodgeChallenger object for the year 2020 with specific details
    public static DodgeChallenger createChallenger2020() {
        return new DodgeChallenger("Challenger", 2020, "Gasoline", 2, ColorEnum.BLACK);
    }
   
    // Static method to create a DodgeChallenger object for the year 2021 with specific details
    public static DodgeChallenger createChallenger2021() {
        return new DodgeChallenger("Challenger", 2021, "Gasoline", 2, ColorEnum.GRAY);
    }
   
    // Override toCSVString method excel representation of the DodgeChallenger object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }

}
