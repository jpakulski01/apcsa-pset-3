import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        double Fahrenheit;
        double Celsius;
        double Kelvin;
        System.out.print("Fahrenheit : ");
        Fahrenheit = userInput.nextDouble();
        userInput.close();
        Celsius = (Fahrenheit - 32) * 5 / 9;
        Kelvin = Celsius + 273.15;
        System.out.print("\nCelsius : ");
        System.out.printf("%,.2f",Celsius);
        System.out.print("\nKelvin  : ");
        System.out.printf("%,.2f",Kelvin);
    }
}
