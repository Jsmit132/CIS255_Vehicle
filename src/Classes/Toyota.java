import java.util.Scanner;

public class Toyota extends Make {

    // Method to create a vehicle for the Toyota make
    public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
        String navType;
        String navModel;

        do {
            displayTypeMenu(make); // Display the type menu for Toyota
            navType = navScan.nextLine();

            switch (navType) {
                case "1": // Coupe
                    // Logic for creating a Toyota Coupe vehicle
                    Eighty6 eightySix = Eighty6.create86();
                    Gr86 grEightySix = Gr86.createGr86();
                    Supra supra = Supra.createSupra();

                    // Display the available Coupe models
                    eightySix.displayDetails("1.");
                    grEightySix.displayDetailsNoHead("2.");
                    supra.displayDetailsNoHead("3.");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Coupe model
                    switch (navModel) {
                        case "1": // 86
                            vehicleStorage.addVehicle(eightySix);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // GR86
                            vehicleStorage.addVehicle(grEightySix);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Supra
                            vehicleStorage.addVehicle(supra);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "1" block after processing the Coupe logic

                case "2": // Sedan
                    // Logic for creating a Toyota Sedan vehicle
                    Avalon avalon = Avalon.createAvalon();
                    Camry camry = Camry.createCamry();
                    Yaris yaris = Yaris.createYaris();

                    // Display the available Sedan models
                    avalon.displayDetails("1.");
                    camry.displayDetailsNoHead("2.");
                    yaris.displayDetailsNoHead("3.");
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Sedan model
                    switch (navModel) {
                        case "1": // Avalon
                            vehicleStorage.addVehicle(avalon);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // Camry
                            vehicleStorage.addVehicle(camry);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Yaris
                            vehicleStorage.addVehicle(yaris);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "2" block after processing the Sedan logic

                case "3": // Truck
                    // Logic for creating a Toyota Truck vehicle
                    Tacoma tacoma = Tacoma.createTacoma();
                    Tundra tundraWhite = Tundra.createTundraWhite();
                    Tundra tundraBlue = Tundra.createTundraBlue();

                    // Display the available Truck models
                    tacoma.displayDetails("1.");
                    tundraWhite.displayDetailsNoHead("2.");
                    tundraBlue.displayDetailsNoHead("3.");                   
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Truck model
                    switch (navModel) {
                        case "1": // Tacoma
                            vehicleStorage.addVehicle(tacoma);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // Tundra White
                            vehicleStorage.addVehicle(tundraWhite);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Tundra Blue
                            vehicleStorage.addVehicle(tundraBlue);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "3" block after processing the Truck logic

                case "4": // Break to return to the previous menu
                    return;

                default: // Error
                    System.out.println("Invalid type for Toyota. Please try again.");
                    break;
            }
        } while (!navType.equals("4"));
    }
}
