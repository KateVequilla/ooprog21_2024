import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        BloodData bloodData = new BloodData();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Blood Type: ");
        String bloodType = scanner.nextLine();
        bloodData.setBloodType(bloodType);

        System.out.print("Enter Rh Factor (+ or -): ");
        String rhFactorStr = scanner.nextLine();
        boolean rhFactor = rhFactorStr.equalsIgnoreCase("+");
        bloodData.setRhFactor(rhFactor);

        scanner.close();
        bloodData.displayBloodInfo();
    }
}
