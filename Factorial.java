//Program to Calculates the factorial of a given number using a for loop.
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking for negative number
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            long factorial = 1;

            // Calculating factorial
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            // Displaying result
            System.out.println("Factorial of " + n + " is: " + factorial);
        }

        // Closing scanner
        sc.close();
    }
}