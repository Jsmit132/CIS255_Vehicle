import java.util.Scanner;

public class CIS255_Vehicle {

   public static void main(String[] args) {
        // Menu scanner
      Scanner navScan = new Scanner(System.in);
      String navMain;
      
      VehicleStorage vehicleStorage = new VehicleStorage(); // Create an instance of VehicleStorage
   
      do {
            // Display Main Menu
         displayMainMenu();
            // Instantiate navInput
         navMain = navScan.nextLine();
      
            // Menu Switch
         switch (navMain) {
            case "1": // Show create vehicle menu
               Make.createMakeMenu(navScan, vehicleStorage);
               break;
            case "2": // Show created vehicles
               vehicleStorage.showVehiclesMenu();
               break;
               
            case "3": // Save created vehiclesr
               if (vehicleStorage.getAllVehicles().isEmpty()) {
                  System.out.println("No vehicles created yet.");
               } else {
                  vehicleStorage.showVehiclesMenu(); // Show the list of vehicles before saving
                  System.out.print("Enter the filename to save the data: ");
                  String filename = navScan.nextLine();
                  vehicleStorage.saveToFile(filename);
               }
               break;
            case "4": // Exit
               System.out.println("Exiting the application...");
               break;
         
            default: // Error
               System.out.println("Invalid choice. Please try again.");
         }
      
      } while (!navMain.equals("4"));
        // Close menu scanner if not in use
      navScan.close();
   }

    // Print main menu to CL
   private static void displayMainMenu() {
      System.out.println("\n");
      System.out.println("=== Main Menu === \n");
   
      System.out.println("1. Create Vehicle");
      System.out.println("2. Show Vehicles");
      System.out.println("3. Save to File");
      System.out.println("4. Exit \n");
   
      System.out.print("Enter your choice: ");
   }

   

   private static void showVehiclesMenu(Scanner navScan) {
        // Logic for showing vehicles
      System.out.println("Showing vehicles...");
   }

}
