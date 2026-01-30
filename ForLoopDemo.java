import java.util.Scanner;

// Program to print numbers in a user-defined range using for loop
public class ForLoopDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking start and end values from user
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        // Printing numbers from start to end
        System.out.println("Numbers from " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }

        // Closing scanner
        sc.close();
    }
}
