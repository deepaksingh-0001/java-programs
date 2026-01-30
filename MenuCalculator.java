// Menu-driven calculator program using Java
import java.util.Scanner;
public class MenuCalculator 
{
    public static void main(String [] args) 
    {
        // Scanner object for taking user input
        Scanner sc =new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter your first number:");
        int a=sc.nextInt();
        System.out.print("Enter your second number:");
        int b=sc.nextInt();

        // Displaying calculator menu
        System.out.println("----menu----");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. product");
        System.out.println("4. division");
        
        // Taking user choice for operation
        System.out.print("Enter your choice:");
        int choice =sc.nextInt();

        // Performing operation based on user choice
        if(choice==1)
        {
            System.out.println("sum = "+(a+b));
        }

        else if(choice==2)
        {
            System.out.println("difference = "+(a-b));
        }

        else if(choice==3)
        {   
            System.out.println("product = "+(a*b));
        }

        else if(choice==4)
        {    
            if(b == 0)
                {
                    System.out.println("Division by zero is not allowed");
                }
            else
                {
                    System.out.println("divide = " + ((double) a / b));
                }

        }

        else
        {
            System.out.println("It is invalid value !!");
        }
        // Closing the scanner to free resources
        sc.close();
    }   
}