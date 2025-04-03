package Q_02;

public class Temperature {
    private double  celsius;
    //non-parameterized constructor
    public Temperature() {
        this.celsius = 0.0;
    }
    //parameterized constructor
    public Temperature(double celsius) {
        this.celsius = celsius;
    }
    //method to convert Celsius to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9/5) + 32;
    }
    //method to convert Fahrenheit to Celsius
    public double toCelsius() {
        return (celsius - 32) * 5/9;
    }
    //getter and setter methods
    public double getCelsius() {
        return celsius;
    }
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
