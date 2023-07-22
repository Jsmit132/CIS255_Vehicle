// Dart class extends the abstract class Sedan
public class Dart extends Sedan {
   
   // Constructor to initialize the Dart object with the given details
   public Dart(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
      super("Dodge", "Sedan", model, year, fuelType, numberOfDoors, color);
   }

   // Static method to create a Dart object with specific details
   public static Dart createDart() {
      return new Dart("Dart", 2014, "Gasoline", 4, ColorEnum.BLUE);
   }

   // Override the toCSVString method to provide the CSV representation of the Dart object
   @Override
   public String toCSVString() {
      return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
   }
}
