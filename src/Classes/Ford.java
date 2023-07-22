import java.util.Scanner;

public class Ford extends Make {

    public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
        String navType;
        String navModel;

        do {
            displayTypeMenu(make); // Display the type menu for Ford
            navType = navScan.nextLine();

            switch (navType) {
                case "1": // Coupe
                    // Logic for creating a Ford Coupe vehicle
                    Mustang mustang2018 = Mustang.createMustang2018();
                    Mustang mustang2019 = Mustang.createMustang2019();
                    Mustang mustang2020 = Mustang.createMustang2020();

                    // Display the available Coupe models
                    mustang2018.displayDetails("1.");
                    mustang2019.displayDetailsNoHead("2.");
                    mustang2020.displayDetailsNoHead("3.");                    
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Coupe model
                    switch (navModel) {
                        case "1": // mustang2018
                            vehicleStorage.addVehicle(mustang2018);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // mustang2019
                            vehicleStorage.addVehicle(mustang2019);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // mustang2020
                            vehicleStorage.addVehicle(mustang2020);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "1" block after processing the Coupe logic

                case "2": // Sedan
                    // Logic for creating a Ford Sedan vehicle
                    Fusion fusion = Fusion.createFusion();
                    Taurus taurus = Taurus.createTaurus();
                    Focus focus = Focus.createFocus();

                    // Display the available Sedan models
                    fusion.displayDetails("1.");
                    taurus.displayDetailsNoHead("2.");
                    focus.displayDetailsNoHead("3.");
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Sedan model
                    switch (navModel) {
                        case "1": // fusion
                            vehicleStorage.addVehicle(fusion);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // taurus
                            vehicleStorage.addVehicle(taurus);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // focus
                            vehicleStorage.addVehicle(focus);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "2" block after processing the Sedan logic

                case "3": // Truck
                    // Logic for creating a Ford Truck vehicle
                    F150 f150 = F150.createF150();
                    F250 f250 = F250.createF250();
                    Ranger ranger = Ranger.createRanger();

                    // Display the available Truck models
                    f150.displayDetails("1.");
                    f250.displayDetailsNoHead("2.");
                    ranger.displayDetailsNoHead("3.");
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Truck model
                    switch (navModel) {
                        case "1": // f150
                            vehicleStorage.addVehicle(f150);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // f250
                            vehicleStorage.addVehicle(f250);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // ranger
                            vehicleStorage.addVehicle(ranger);
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
                    System.out.println("Invalid type for Ford. Please try again.");
                    break;
            }
        } while (!navType.equals("4"));
    }
}
