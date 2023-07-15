public class DodgeChallenger extends Coupe {
   public DodgeChallenger(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
      super("Dodge", "Coupe", model, year, fuelType, numberOfDoors, color);
   }
   
   public static DodgeChallenger createChallenger2019() {
      return new DodgeChallenger("Challenger", 2019, "Gasoline", 2, ColorEnum.WHITE);
   }
   
   public static DodgeChallenger createChallenger2020() {
      return new DodgeChallenger("Challenger", 2020, "Gasoline", 2, ColorEnum.BLACK);
   }
   
   public static DodgeChallenger createChallenger2021() {
      return new DodgeChallenger("Challenger", 2021, "Gasoline", 2, ColorEnum.GRAY);
   }
   
   @Override
   public String toCSVString() {
      return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
   }

}
