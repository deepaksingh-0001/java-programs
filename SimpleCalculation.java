import java.util.Scanner;
public class SimpleCalculation 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("enter the first value = ");
        int firstnumber=sc.nextInt();

        System.out.print("enter the second value = ");
        int secondnumber=sc.nextInt();

        int addition=firstnumber+secondnumber;
        System.out.println("sum = "+addition);

        int subtract=firstnumber-secondnumber;
        System.out.println("subtract = "+subtract);

        int product=firstnumber*secondnumber;
        System.out.println("product = "+product);

        double divide=(double)firstnumber/secondnumber;
        System.out.println("divide = "+divide);

        sc.close();
    }    
}
