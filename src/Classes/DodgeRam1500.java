// DodgeRam1500 class extends the abstract class Coupe
public class DodgeRam1500 extends Coupe {
    // Constructor to initialize the DodgeRam1500 object with the given details
    public DodgeRam1500(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Truck", model, year, fuelType, numberOfDoors, color);
    }
   
    // Static method to create a red DodgeRam1500 object with specific details
    public static DodgeRam1500 createRam1500Red() {
        return new DodgeRam1500("Ram 1500", 2018, "Gasoline", 4, ColorEnum.RED);
    }
   
    // Static method to create a blue DodgeRam1500 object with specific details
    public static DodgeRam1500 createRam1500Blue() {
        return new DodgeRam1500("Ram 1500", 2018, "Gasoline", 4, ColorEnum.BLUE);
    }
   
    // Override toCSVString method excel representation of the DodgeRam1500 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
