import java.util.Scanner;

public class CIS255_Vehicle {

      public static void main(String[] args) {
         // Menu scanner for main
         Scanner navScan = new Scanner(System.in);
         String navInput;

         do {
            displayMainMenu();
            navInput = navScan.nextLine();

            switch (navInput) {
                case "1": // Show create vehicle menu
                    createVehicleMenu(navScan);
                    break;
                case "2": // Show created vehicle'(s)
                    showVehiclesMenu(navScan);
                    break;
                case "3": // Save created vehicle'(s)
                    saveToFileMenu(navScan);
                    break;
                case "4": // Exit
                    System.out.println("Exiting the application...");
                    break;
                    
                default: // Error
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while (!navInput.equals("4"));
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
    
   // Menu scanner for create vehicle menu
    private static void createVehicleMenu(Scanner navScan) {
        String navInput;
        String[] make = {"Coupe", "Sedan", "Truck"};

        do {
            displayCreateVehicleMenu();
            navInput = navScan.nextLine();

            switch (navInput) {                
                case "1":                
                    // Logic for creating a coupe
                    Make.main(new String[]{make[0]});
                    System.out.println(ColorEnum.Silver);
                    break;
                    
                case "2":                
                    // Logic for creating a truck
                    Make.main(new String[]{make[1]});
                    System.out.println(ColorEnum.Black);
                    break;
                    
                case "3":                
                    // Logic for creating a sedan
                    Make.main(new String[]{make[2]});
                    System.out.println(ColorEnum.Red);
                    break;         
                    
                case "4":  // Break to return to previous menu
                    break;
                    
                default: // Error
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!navInput.equals("4"));
    }

   // Display create vehicle menu
    private static void displayCreateVehicleMenu() {
        System.out.println("\n");
        System.out.println("=== Create Vehicle Menu === \n");
        
        System.out.println("1. Create Coupe");
        System.out.println("2. Create Sedan");
        System.out.println("3. Create Truck");
        System.out.println("4. Go Back \n");
        
        System.out.print("Enter your choice: ");
    }


    private static void showVehiclesMenu(Scanner navScan) {
        // Logic for showing vehicles
        System.out.println("Showing vehicles...");
    }

    private static void saveToFileMenu(Scanner navScan) {
        // Logic for saving to a file
        System.out.println("Saving to file...");
    }
}


