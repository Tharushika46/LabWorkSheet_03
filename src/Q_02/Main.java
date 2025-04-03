package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object to read input
        System.out.print("Enter the themperature in Faranheite(℉) : " );
        double fahrenheit = scan.nextDouble();      // Create a Temperature object
        Temperature temp1 = new Temperature(fahrenheit);
        System.out.println("Temperature in Celsius: " + temp1.toCelsius() + " ℃");
    }

}
