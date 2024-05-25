import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float marks = input.nextFloat();
        // int marksInt = (int) marks;
        // System.out.println(marksInt);
        // now again converting it into flaot
        // System.out.println("Afte converting it into float: " + (float)marksInt);
        // float marksFloat = (float)marks;
        // System.out.println(marksFloat);
        // java performs automatic type conversion
        // int to float
        // int a = 10;
        // float b = a;
        // System.out.println(b);
        
        // this is called type casting
        // type casting is of two types
        // 1. Implicit type casting
        // 2. Explicit type casting
        // Implicit type casting
        // byte -> short -> int -> long -> float -> double
        // Explicit type casting
        // double -> float -> long -> int -> short -> byte
        
        // float c = 20.5f;
        // int d = (int)c;
        // System.out.println(d);
    }
}
