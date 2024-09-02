import java.util.Scanner;

public class CarlysEventPrice {

    public static void main(String[] args) {
        System.out.println("*************************************************");
        System.out.println("* Carly's makes the food that makes it a party. *");
        System.out.println("*************************************************");
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of guests: ");
        int numGuests = scanner.nextInt();

        double pricePerGuest;
        if (numGuests >= 50) {
            pricePerGuest = 32.00;
            System.out.println("\nThis is considered a large event and qualifies for a discount!");
        } else {
            pricePerGuest = 35.00;
        }

        
        double totalPrice = pricePerGuest * numGuests;

        System.out.println("\nNumber of Guests: " + numGuests);
        System.out.println("Price per Guest: $" + pricePerGuest);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Is Large Event (50+ guests): " + (numGuests >= 50));
    }
}