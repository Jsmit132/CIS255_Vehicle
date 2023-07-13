public class Make {
    public static void main(String[] args) {
        if (args.length > 0) {
            String vehicleType = args[0];

            switch (vehicleType) {
                case "Coupe": // Print Coupe
                    System.out.println("Coupe");
                    break;
                    
                case "Sedan": // Print Sedan
                    System.out.println("Sedan");
                    break;
                    
                case "Truck": // Print Truck
                    System.out.println("Truck");
                    break;
                    
                default: // Error
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } else {
            System.out.println("No vehicle type provided.");
        }
    }
}
