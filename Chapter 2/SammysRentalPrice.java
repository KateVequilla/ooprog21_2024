import java.util.Scanner;

public class SammysRentalPrice {

   public static void main(String[] args) {
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println("S Sammy's makes it fun in the sun. S");
      System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
      System.out.println(" ");
         
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter number of minutes rented: ");
         int totalMinutes = scanner.nextInt();
         
         int hours = totalMinutes / 60;
         int remainingMinutes = totalMinutes % 60;

         double rentalCost = hours * 40.00 + remainingMinutes;

      System.out.println("\nRental Duration: " + hours + " hours and " + remainingMinutes + " minutes");
      System.out.println("Total Rental Cost: $" + rentalCost);
    }
}