import java.util.Scanner;

/*
 * Program Name: SumOfNaturalNumbers
 * Description : Calculates the sum of first N natural numbers.
 */
public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Validating input
        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {

            int sum = 0;

            // Calculating sum of first N natural numbers
            for (int i = 1; i <= n; i++) {
                sum += i;
            }

            // Displaying result
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }

        // Closing scanner
        sc.close();
    }
}