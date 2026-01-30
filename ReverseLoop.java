import java.util.Scanner;

// Program to print numbers in reverse order using a user-defined range
public class ReverseLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking range input from user
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // Printing numbers in reverse order
        System.out.println("Numbers in reverse order:");
        for (int i = start; i >= end; i--) {
            System.out.println(i);
        }

        // Closing scanner
        sc.close();
    }
}
