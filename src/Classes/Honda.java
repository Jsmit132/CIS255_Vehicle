import java.util.Scanner;

public class Honda extends Make {

    // Method to create a vehicle for the Honda make
    public static void createVehicle(Scanner navScan, String make, VehicleStorage vehicleStorage) {
        String navType;
        String navModel;

        do {
            displayTypeMenu(make); // Display the type menu for Honda
            navType = navScan.nextLine();

            switch (navType) {
                case "1": // Coupe
                    // Logic for creating a Honda Coupe vehicle
                    Accord accord2012 = Accord.createAccord2012();
                    CRZ crz2013 = CRZ.createCRZ2013();
                    CRZ crz2015 = CRZ.createCRZ2015();

                    // Display the available Coupe models
                    accord2012.displayDetails("1.");
                    crz2013.displayDetailsNoHead("2.");
                    crz2015.displayDetailsNoHead("3.");
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Coupe model
                    switch (navModel) {
                        case "1": // Accord 2012
                            vehicleStorage.addVehicle(accord2012);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // CR-Z 2013
                            vehicleStorage.addVehicle(crz2013);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // CR-Z 2015
                            vehicleStorage.addVehicle(crz2015);
                            return; // Return to the previous menu after adding the vehicle

                        case "4": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "1" block after processing the Coupe logic

                case "2": // Sedan
                    // Logic for creating a Honda Sedan vehicle
                    Accord accord2016 = Accord.createAccord2016();
                    Civic civic2015 = Civic.createCivic2015();

                    // Display the available Sedan models
                    accord2016.displayDetails("1.");
                    civic2015.displayDetailsNoHead("2.");
                    System.out.println("3. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Sedan model
                    switch (navModel) {
                        case "1": // Accord 2016
                            vehicleStorage.addVehicle(accord2016);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // Civic 2015
                            vehicleStorage.addVehicle(civic2015);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Break to return to the previous menu
                            break;

                        default: // Error
                            System.out.println("Invalid choice. Please try again.");
                    }
                    break; // Exit the Case "2" block after processing the Sedan logic

                case "3": // Truck
                    // Logic for creating a Honda Truck vehicle
                    Ridgeline ridgeline2018 = Ridgeline.createRidgeline2018();
                    Ridgeline ridgeline2017 = Ridgeline.createRidgeline2017();
                    Ridgeline ridgeline2019 = Ridgeline.createRidgeline2019();

                    // Display the available Truck models
                    ridgeline2018.displayDetails("1.");
                    ridgeline2017.displayDetailsNoHead("2.");
                    ridgeline2019.displayDetailsNoHead("3.");
                    System.out.println("4. Go Back \n");

                    System.out.print("Enter your choice: ");
                    navModel = navScan.nextLine();

                    // Input Switch input for selecting a Truck model
                    switch (navModel) {
                        case "1": // Ridgeline 2018
                            vehicleStorage.addVehicle(ridgeline2018);
                            return; // Return to the previous menu after adding the vehicle

                        case "2": // Ridgeline 2017
                            vehicleStorage.addVehicle(ridgeline2017);
                            return; // Return to the previous menu after adding the vehicle

                        case "3": // Ridgeline 2019
                            vehicleStorage.addVehicle(ridgeline2019);
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
                    System.out.println("Invalid type for Honda. Please try again.");
                    break;
            }
        } while (!navType.equals("4"));
    }
}
