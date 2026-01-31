import java.util.Scanner;

/*
 * Program Name: Swapping
 * Description : Swaps two numbers without using a third variable.
 */
public class Swapping 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Displaying values before swapping
        System.out.println("\nBefore Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swapping without using third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Displaying values after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Closing scanner
        sc.close();
    }
}

/*
public class Swaping 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);

        int a=10;
        int b=20;
        System.out.println("original value before swapping: a="+a+" b="+b);
       
        a=(a+b);
        b=(a-b);
        a=(a-b);
        System.out.println("value a after swapping:"+a);
        System.out.println("value b after swapping:"+b);
        sc.close();
    }
}
*/