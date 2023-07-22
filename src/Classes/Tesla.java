import java.util.Scanner;

public class Tesla extends Make {

    // Method to create a vehicle for the Tesla make
    public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
        String navType;
        String navModel;

        do {
            displayTypeMenu(make); // Display the type menu for Tesla
            navType = navScan.nextLine();

            switch (navType) {
                case "1": // Sedan
                    // Logic for creating a Tesla Sedan vehicle
                    Model3 model3_2018 = Model3.createModel3_2018();
                    Model3 model3_2023 = Model3.createModel3_2023();
                    ModelS modelS_2021_blue = ModelS.createModelS_2021_blue();
                    ModelS modelS_2021_white = ModelS.createModelS_2021_white();
                    ModelY modelY_2021 = ModelY.createModelY_2021();
                    ModelY modelY_2020 = ModelY.createModelY_2020();
                    ModelY modelY_2022 = ModelY.createModelY_2022();

                    // Display the available Sedan models
                    model3_2018.displayDetails("1.");
                    model3_2023.displayDetailsNoHead("2.");
                    modelS_2021_blue.displayDetailsNoHead("3.");
                    modelS_2021_white.displayDetailsNoHead("4.");
                    modelY_2021.displayDetailsNoHead("5.");
                    modelY_2020.displayDetailsNoHead("6.");
                    modelY_2022.displayDetailsNoHead("7.");
                    System.out.println("8. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Sedan model
                    switch (navModel) {
                        case "1": // Model 3 (2018)
                            vehicleStorage.addVehicle(model3_2018);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // Model 3 (2023)
                            vehicleStorage.addVehicle(model3_2023);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Model S (2021) Blue
                            vehicleStorage.addVehicle(modelS_2021_blue);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Model S (2021) White
                            vehicleStorage.addVehicle(modelS_2021_white);
                            return; // Return to the previous menu after adding the vehicle

                        case "5": // Model Y (2021)
                            vehicleStorage.addVehicle(modelY_2021);
                            return; // Return to the previous menu after adding the vehicle

                        case "6": // Model Y (2020)
                            vehicleStorage.addVehicle(modelY_2020);
                            return; // Return to the previous menu after adding the vehicle

                        case "7": // Model Y (2022)
                            vehicleStorage.addVehicle(modelY_2022);
                            return; // Return to the previous menu after adding the vehicle

                        case "8": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "1" block after processing the Sedan logic


                case "2": // Break to return to the previous menu
                    return;

                default: // Error
                    System.out.println("Invalid type for Tesla. Please try again.");
                    break;
            }
        } while (!navType.equals("2"));
    }
}
