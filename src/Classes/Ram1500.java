// Ram1500 class extends the abstract class Coupe
public class Ram1500 extends Truck {
    // Constructor to initialize the Ram1500 object with the given details
    public Ram1500(String model, int year, String fuelType, int numberOfDoors, ColorEnum color) {
        super("Dodge", "Truck", model, year, fuelType, numberOfDoors, color);
    }
   
    // Static method to create a red Ram1500 object with specific details
    public static Ram1500 createRam1500Red() {
        return new Ram1500("Ram 1500", 2018, "Gasoline", 4, ColorEnum.RED);
    }
   
    // Static method to create a blue Ram1500 object with specific details
    public static Ram1500 createRam1500Blue() {
        return new Ram1500("Ram 1500", 2018, "Gasoline", 4, ColorEnum.BLUE);
    }
   
    // Override toCSVString method excel representation of the Ram1500 object
    @Override
    public String toCSVString() {
        return make + "|" + type + "|" + model + "|" + year + "|" + fuelType + "|" + numberOfDoors + "|" + color;
    }
}
