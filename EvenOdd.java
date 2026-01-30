import java.util.Scanner;

// Program to check whether a number is even or odd
public class EvenOdd {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking number input from user
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        // Checking even or odd using modulus operator
        if (num % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        // Closing the scanner
        sc.close();
    }
}
