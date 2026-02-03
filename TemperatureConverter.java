import java.util.Scanner;

/*
 * Program Name: TemperatureConverter
 * Description : Converts temperature from Fahrenheit to Celsius
 *               and Celsius to Fahrenheit.
 */
public class TemperatureConverter 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Taking Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        // Converting Fahrenheit to Celsius
        float celsiusFromF = (fahrenheit - 32) * 5 / 9;

        // Taking Celsius input
        System.out.print("Enter temperature in Celsius: ");
        float celsius = sc.nextFloat();

        // Converting Celsius to Fahrenheit
        float fahrenheitFromC = (celsius * 9 / 5) + 32;

        // Displaying results
        System.out.println("\nConverted Temperatures:");
        System.out.println("Fahrenheit to Celsius = " + celsiusFromF);
        System.out.println("Celsius to Fahrenheit = " + fahrenheitFromC);

        // Closing scanner
        sc.close();
    }
}