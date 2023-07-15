import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VehicleStorage {
   private List<IVehicle> vehicles;

   public VehicleStorage() {
      vehicles = new ArrayList<>();
   }

   // Method to add a vehicle to the storage
   public void addVehicle(IVehicle vehicle) {
      vehicles.add(vehicle);
   }

   // Method to retrieve all vehicles in the storage
   public List<IVehicle> getAllVehicles() {
      return vehicles;
   }
   
   public void showVehiclesMenu() {
      if (vehicles.isEmpty()) {
      
         System.out.println("No vehicles created yet.");
         
      } else {
         System.out.println("Showing vehicles...");
      
         int count = 1;
         for (IVehicle vehicle : vehicles) {
            if (count == 1) {
               System.out.print("");
               vehicle.displayDetails(count + ". ");
               count++;
            } else {
               System.out.print("");
               vehicle.displayDetailsNoHead(count + ". ");
               count++;
            }
         }
      }
   }
      
   public void saveToFile(String filename) {
      if (!filename.endsWith(".csv")) {
         filename += ".csv";
      }
      
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
         // Write the header row
         writer.write("Make|Type|Model|Year|Engine Type|Door Count|Color");
         writer.newLine();
         
         // Write each vehicle's data to the file
         for (IVehicle vehicle : vehicles) {
            String vehicleData = vehicle.toCSVString();
            writer.write(vehicleData);
            writer.newLine();
         }
         
         System.out.println("Data saved to file: " + filename);
      } catch (IOException e) {
         System.out.println("Error while saving data to file: " + e.getMessage());
      }
   }
}
