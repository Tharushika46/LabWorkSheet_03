package Q_03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Create a outer Circle object
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius of the outer circle: ");
        double rad1 = scan.nextDouble();
        Circle innerCircle = new Circle(rad1);

        // Create a inner Circle object
        System.out.print("Enter the radius of the inner circle: ");
        double rad2 = scan.nextDouble();
        Circle outerCircle = new Circle(rad2);

        // Display the area and circumference of the circles
        System.out.println("Area of the ring: " + String.format("%.2f",innerCircle.computeArea() - outerCircle.computeArea()));
        System.out.println("Circumference of the ring: " + String.format("%.2f",innerCircle.computeCircumference() + outerCircle.computeCircumference()));
    }
}
