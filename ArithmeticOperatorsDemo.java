/*
 * Program Name: ArithmeticOperators
 * Description : Demonstrates all arithmetic operators in Java.
 */
public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        // Arithmetic operations
        System.out.println("Addition:");
        System.out.println("a + b = " + (a + b));

        System.out.println("\nSubtraction:");
        System.out.println("a - b = " + (a - b));

        System.out.println("\nMultiplication:");
        System.out.println("a * b = " + (a * b));

        System.out.println("\nDivision:");
        System.out.println("a / b = " + (a / b));       // Integer division
        System.out.println("a / b (float) = " + ((float) a / b));

        System.out.println("\nModulus:");
        System.out.println("a % b = " + (a % b));

        System.out.println("\nIncrement:");
        System.out.println("a++ = " + (a++));
        System.out.println("After increment, a = " + a);

        System.out.println("\nDecrement:");
        System.out.println("b-- = " + (b--));
        System.out.println("After decrement, b = " + b);
    }
}