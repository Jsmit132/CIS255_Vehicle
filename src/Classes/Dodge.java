import java.util.Scanner;

public class Dodge extends Make {

   // Method to create a vehicle for the Dodge make
   public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
      String navType;
      String navModel;
   
      do {
         displayTypeMenu(make); // Display the type menu for Dodge
         navType = navScan.nextLine();
      
         switch (navType) {
            case "1": // Coupe
               // Logic for creating a Dodge Coupe vehicle
               Challenger challenger2019 = Challenger.createChallenger2019();
               Challenger challenger2020 = Challenger.createChallenger2020();
               Challenger challenger2021 = Challenger.createChallenger2021();
            
               // Display the available Coupe models
               challenger2019.displayDetails("1.");
               challenger2020.displayDetailsNoHead("2.");
               challenger2021.displayDetailsNoHead("3.");
               System.out.println("4. Go Back \n");
            
               System.out.print("Enter your choice: ");
               navModel = navScan.nextLine();
            
               // Input Switch input for selecting a Coupe model
               switch (navModel) {
                  case "1": // challenger2019
                     vehicleStorage.addVehicle(challenger2019);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "2": // challenger2020
                     vehicleStorage.addVehicle(challenger2020);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "3": // challenger2021
                     vehicleStorage.addVehicle(challenger2021);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "4": // Break to return to the previous menu
                     break;
               
                  default: // Error
                     System.out.println("Invalid choice. Please try again.");
               }
               break; // Exit the Case "1" block after processing the Coupe logic
         
            case "2": // Sedan
               // Logic for creating a Dodge Sedan vehicle
               Avenger avenger = Avenger.createAvenger();
               Charger charger = Charger.createCharger();
               Dart dart = Dart.createDart();
            
               // Display the available Sedan models
               avenger.displayDetails("1.");
               charger.displayDetailsNoHead("2.");
               dart.displayDetailsNoHead("3.");
               System.out.println("4. Go Back \n");
            
               System.out.print("Enter your choice: ");
               navModel = navScan.nextLine();
            
               // Input Switch input for selecting a Sedan model
               switch (navModel) {
                  case "1": // avenger
                     vehicleStorage.addVehicle(avenger);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "2": // charger
                     vehicleStorage.addVehicle(charger);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "3": // dart
                     vehicleStorage.addVehicle(dart);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "4": // Break to return to the previous menu
                     break;
               
                  default: // Error
                     System.out.println("Invalid choice. Please try again.");
               }
               break; // Exit the Case "2" block after processing the Sedan logic
         
            case "3": // Truck
               // Logic for creating a Dodge Truck vehicle
               Ram1500 ram1500Blue = Ram1500.createRam1500Blue();
               Ram1500 ram1500Red = Ram1500.createRam1500Red();
               Ram2500 ram2500 = Ram2500.createRam2500();
            
               // Display the available Truck models
               ram1500Blue.displayDetails("1.");
               ram1500Red.displayDetailsNoHead("2.");
               ram2500.displayDetailsNoHead("3.");
               System.out.println("4. Go Back \n");
            
               System.out.print("Enter your choice: ");
               navModel = navScan.nextLine();
            
               // Input Switch input for selecting a Truck model
               switch (navModel) {
                  case "1": // ram1500Blue
                     vehicleStorage.addVehicle(ram1500Blue);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "2": // ram1500Red
                     vehicleStorage.addVehicle(ram1500Red);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "3":// ram2500
                     vehicleStorage.addVehicle(ram2500);
                     return; // Return to the previous menu after adding the vehicle
               
                  case "4": // Break to return to the previous menu
                     break;
               
                  default: // Error
                     System.out.println("Invalid choice. Please try again.");
               }
               break; // Exit the Case "2" block after processing the Sedan logic
         
            case "4": // Break to return to the previous menu
               return;
         
            default: // Error
               System.out.println("Invalid type for Dodge. Please try again.");
               break;
         }
      } while (!navType.equals("4"));
   }
}
