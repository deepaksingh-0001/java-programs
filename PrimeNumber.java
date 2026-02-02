import java.util.Scanner;

/*
 * Program Name: PrimeNumber
 * Description : Checks whether a given number is prime or not.
 */
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) 
        {
            isPrime = false;
        } 
        else 
        {
            // Checking divisibility from 2 to square root of number
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Displaying result
        if (isPrime)     
        {
            System.out.println("The number is a Prime Number");
        } 
        else 
        {
            System.out.println("The number is Not a Prime Number");
        }

        // Closing scanner
        sc.close();
    }
}