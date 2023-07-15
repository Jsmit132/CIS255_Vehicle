import java.util.Scanner;

public interface IVehicle {

   void displayDetails(String listNum);
   void displayDetailsNoHead(String listNum);
   
   String toCSVString();

   static int getIntInput(Scanner scanner) {
      int result = 0;
      try {
         result = scanner.nextInt();
      } catch (Exception e) {
         result = getIntInput(scanner); // Recursive call to get valid input
      }
      return result;
   }
}