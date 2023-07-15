import java.util.Scanner;

public class Dodge extends Make {

   public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
      String navType;
      String navModel;
   
      do {
         displayTypeMenu(make);
         navType = navScan.nextLine();
      
         switch (navType) {
            case "1": // Coupe
               // Logic for creating a Dodge Coupe vehicle
               DodgeChallenger challenger2019 = DodgeChallenger.createChallenger2019();
               DodgeChallenger challenger2020 = DodgeChallenger.createChallenger2020();
               DodgeChallenger challenger2021 = DodgeChallenger.createChallenger2021();
            
               // Create Menu
               challenger2019.displayDetails("1.");
               challenger2020.displayDetailsNoHead("2.");
               challenger2021.displayDetailsNoHead("3.");
            
               System.out.print("Enter your choice: ");
               navModel = navScan.nextLine();
            
               // Input Switch input
               switch (navModel) {
                  case "1": // challenger2019
                     vehicleStorage.addVehicle(challenger2019);
                     return;
               
                  case "2": // challenger2020
                     vehicleStorage.addVehicle(challenger2020);
                     return;
               
                  case "3": // challenger2021
                     vehicleStorage.addVehicle(challenger2021);
                     return;
               
                  case "4": // Break to return to the previous menu
                     break;
               
                  default: // Error
                     System.out.println("Invalid choice. Please try again.");
               }
               break; // Exit the Case "1" block after processing the Coupe logic
         
            case "2": // Sedan
               // Logic for creating a Dodge Sedan vehicle
               System.out.println("Creating a Dodge Sedan vehicle...");
               break;
         
            case "3": // Truck
               // Logic for creating a Dodge Truck vehicle
               System.out.println("Creating a Dodge Truck vehicle...");
               break;
         
            case "4": // Break to return to the previous menu
               return;
         
            default: // Error
               System.out.println("Invalid type for Dodge. Please try again.");
               break;
         }
      } while (!navType.equals("4"));
   }

}
