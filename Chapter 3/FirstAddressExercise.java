public class FirstAddressExercise {

    public static void main(String[] args) {
        displayAddress("Nokia", "Espoo, Finland", "Karaportti 3, 02610 Espoo");
    }

    public static void displayAddress(String companyName, String address, String cityStateZip) {
        System.out.println(companyName);
        System.out.println(address);
        System.out.println(cityStateZip);
        System.out.println("Company: " + companyName);
    }
}