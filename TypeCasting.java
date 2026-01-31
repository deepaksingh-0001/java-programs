// Program to demonstrate type casting in Java
public class TypeCasting {

    public static void main(String[] args) {

        // ---------- Byte and Short Casting ----------
        byte b1 = 120;
        short s1 = 567;

        byte b2 = (byte) s1;   // Narrowing (explicit casting)
        short s2 = b1;         // Widening (implicit casting)

        System.out.println("Value of b1 (byte): " + b1);
        System.out.println("Value of s1 (short): " + s1);

        System.out.println("After casting:");
        System.out.println("Value of b2 (byte from short): " + b2);
        System.out.println("Value of s2 (short from byte): " + s2);
        System.out.println();

        // ---------- int to float and double ----------
        int i = 123456;
        float f = i;      // Widening
        double d = i;     // Widening

        System.out.println("Value of i (int): " + i);
        System.out.println("Value of f (float): " + f);
        System.out.println("Value of d (double): " + d);
        System.out.println();

        // ---------- float to int ----------
        f = 123.45f;
        i = (int) f;      // Narrowing (decimal part lost)
        d = f;

        System.out.println("Value of f (float): " + f);
        System.out.println("Value of i (int from float): " + i);
        System.out.println("Value of d (double from float): " + d);
        System.out.println();

        // ---------- double to float and int ----------
        d = 123.456789;
        f = (float) d;    // Precision loss
        i = (int) d;      // Decimal part lost

        System.out.println("Value of d (double): " + d);
        System.out.println("Value of f (float from double): " + f);
        System.out.println("Value of i (int from double): " + i);
    }
}