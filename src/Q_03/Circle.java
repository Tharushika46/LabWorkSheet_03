package Q_03;

public class Circle {
    private double Radius;      // radius of the circle
    // non-argument constructor
    public Circle() {
        Radius = 0;
    }
    // constructor with argument
    public Circle(double radius) {
        this.Radius = radius;
    }
    // compute area of the circle
    public double computeArea() {
        return (Math.PI * Radius * Radius);
    }
    // compute circumference of the circle
    public double computeCircumference() {
        return (2 * Math.PI * Radius);
    }
    // get radius
    public double getRadius() {
        return Radius;
    }
}
