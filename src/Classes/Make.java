import java.util.Scanner;

public abstract class Make extends CIS255_Vehicle{
   public static void createMakeMenu(Scanner navScan, VehicleStorage vehicleStorage) {
      String navMake;
   
      do {   
         displayMakeMenu();
         navMake = navScan.nextLine();
      
         switch (navMake) {
            case "1": // Dodge
               Dodge.createVehicle(navScan, "Dodge", vehicleStorage);
               break;
         
            case "2": // Ford
                    Ford.createVehicle(navScan, "Ford", vehicleStorage);
               break;
         
            case "3": // Honda
                    Honda.createVehicle(navScan, "Honda", vehicleStorage);
               break;
         
            case "4": // Tesla
                    Tesla.createVehicle(navScan, "Tesla", vehicleStorage);
               break;
         
            case "5": // Toyota
                    Toyota.createVehicle(navScan, "Toyota", vehicleStorage);
               break;
         
            case "6":  // Break to return to the previous menu
               return;
         
            default: // Error
               System.out.println("Invalid choice. Please try again.");
         }
      } while (!navMake.equals("6"));
   }


    // Display create vehicle menu
   private static void displayMakeMenu() {
      System.out.println("\n");
      System.out.println("=== Select A Make === \n");
   
      System.out.println("1. Create Dodge");
      System.out.println("2. Create Ford");
      System.out.println("3. Create Honda");
      System.out.println("4. Create Tesla");
      System.out.println("5. Create Toyota");
      System.out.println("6. Go Back \n");
   
      System.out.print("Enter your choice: ");
   }
   
   public static void displayTypeMenu(String make) {
   
      if (make.equalsIgnoreCase("tesla")) {
      
         System.out.println("\n");
         System.out.println("=== Select a type for " + make +" === \n");
         System.out.println("1. Create Sedan");
         System.out.println("2. Go Back \n");
      
         System.out.print("Enter your choice: ");
         
      }else{
      
         System.out.println("\n");
         System.out.println("=== Select a type for " + make +" === \n");
      
         System.out.println("1. Create Coupe");
         System.out.println("2. Create Sedan");
         System.out.println("3. Create Truck");
         System.out.println("4. Go Back \n");
      
         System.out.print("Enter your choice: ");
      }
   } 
}
