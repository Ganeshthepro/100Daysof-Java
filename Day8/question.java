package Day8;

public class question {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        double celsius = 37;
        System.out.println(celsius + " Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
        
        double fahrenheit = 98.6;
        System.out.println(fahrenheit + " Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
    }
    
}
