public class Circle {
    private double radius;
    private double diameter;
    private double area;

    public Circle() {
        this.radius = 1;
        calculateDiameterAndArea();
    }

    public Circle(double radius) {
        this.radius = radius;
        calculateDiameterAndArea();
    }

    public void setRadius(double rad) {
        this.radius = rad;
        calculateDiameterAndArea();
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }

    private void calculateDiameterAndArea() {
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }
}
