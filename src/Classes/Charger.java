// Charger class extends the abstract class Sedan
public class Charger extends Sedan {
   // Constructor to initialize the Charger object with the given details
   public Charger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
      super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
   }

   // Static method to create a Charger object with specific details
   public static Charger createCharger() {
      return new Charger("Charger", 2016, "Gasoline", 4, ColorEnum.WHITE);
   }

   // Override toCSVString method excel representation of the Challenger object
   @Override
   public String toCSVString() {
      return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
   }
}
