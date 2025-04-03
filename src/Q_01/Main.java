package Q_01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // Create a Scanner object to read input
        System.out.print("Enter the temperature in Celsius(℃) : ");
        double cel = scan.nextDouble();
        Temperature temp = new Temperature(cel);    // Create a Temperature object
        System.out.println("Temperature in Faranheit: " + temp.toFahrenheit() + " ℉");

    }
}
