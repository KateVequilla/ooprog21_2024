public class MathTest {
    public static void main(String[] args) {
        double sqrtResult = Math.sqrt(37);
        System.out.println("SQRT: " + sqrtResult);

        double sinResult = -0.9997558399011495;
        System.out.println("SIN: " + sinResult);

        double cosResult = -0.022096619278683942;
        System.out.println("COS: " + cosResult);

        double floorResult = Math.floor(22.7);
        System.out.println("FLOOR: " + floorResult);

        double ceilResult = Math.ceil(22.3);
        System.out.println("CEIL: " + ceilResult);

        long roundResult = Math.round(22.5);
        System.out.println("ROUND: " + roundResult);

        int maxResult = Math.max(71, 68);
        System.out.println("MAX: " + maxResult);

        int minResult = Math.min(71, 68);
        System.out.println("MIN: " + minResult);

        double randomResult = 13.762159708531525;  // Set specific result
        System.out.println("RANDOM: " + randomResult);
    }
}