// DodgeCharger class extends the abstract class Sedan
public class DodgeCharger extends Sedan {
   // Constructor to initialize the DodgeCharger object with the given details
   public DodgeCharger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
      super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
   }

   // Static method to create a DodgeCharger object with specific details
   public static DodgeCharger createCharger() {
      return new DodgeCharger("Charger", 2016, "Gasoline", 4, ColorEnum.WHITE);
   }

   // Override toCSVString method excel representation of the DodgeChallenger object
   @Override
   public String toCSVString() {
      return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
   }
}
