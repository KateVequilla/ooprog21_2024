public class TestCircle {
    public static void main(String[] args) {
        Circle firstCircle = new Circle();
        firstCircle.setRadius(3.0);

        System.out.println("Radius of the first circle: " + firstCircle.getRadius());
        System.out.println("Diameter of the first circle: " + firstCircle.getDiameter());
        System.out.println("Area of the first circle: " + firstCircle.getArea());

        Circle secondCircle = new Circle();
        secondCircle.setRadius(20.0);

        System.out.println("Radius of the second circle: " + secondCircle.getRadius());
        System.out.println("Diameter of the second circle: " + secondCircle.getDiameter());
        System.out.println("Area of the second circle: " + secondCircle.getArea());
    }
}
