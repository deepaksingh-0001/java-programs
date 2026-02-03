import java.util.Scanner;

/*
 * Program Name: SimpleInterest
 * Description : Calculates Simple Interest using
 *               Principal, Rate and Time.
 */
public class SimpleInterest 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Taking input values
        System.out.print("Enter principal amount: ");
        float principal = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float rate = sc.nextFloat();

        System.out.print("Enter time (in years): ");
        float time = sc.nextFloat();

        // Calculating simple interest
        float interest = (principal * rate * time) / 100;

        // Displaying result
        System.out.println("Simple Interest = " + interest);

        // Closing scanner
        sc.close();
    }
}