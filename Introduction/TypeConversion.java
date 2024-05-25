import java.util.Scanner;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float marks = input.nextFloat();
        int marksInt = (int) marks;
        System.out.println(marksInt);
        // now again converting it into flaot
        System.out.println("Afte converting it into float: " + (float)marksInt);
        float marksFloat = (float)marks;
        System.out.println(marksFloat);
    }
}
