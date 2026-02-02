import java.util.Scanner;

/*
 * Program Name: UseIfElse
 * Description : Checks whether a person is an adult
 *               based on the given age using if-else.
 */
public class UseIf_Else {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking age input from user
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Checking age condition
        if (age >= 18) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are not an Adult");
        }

        // Closing scanner
        sc.close();
    }
}