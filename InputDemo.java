import java.util.Scanner;   // Scanner class import for taking user input

public class InputDemo 
{
    public static void main(String[] args)
    {
        // Create Scanner object to read input from keyboard
        Scanner sc = new Scanner(System.in);

        // Asking user to enter name
        System.out.println("Enter your name:");
        String name = sc.nextLine();   // Read full name (string input)

        // Asking user to enter age
        System.out.println("Enter your age:");
        int age = sc.nextInt();        // Read integer input (age)

        sc.nextLine();                 // Clear input buffer (important step)

        // Asking user to enter city
        System.out.println("Enter your city:");
        String city = sc.nextLine();   // Read city name

        // Displaying the entered details
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);

        // Closing the Scanner object
        sc.close();
    }
}