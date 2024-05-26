import java.util.Scanner;
class NumberWrapper{
    int value;
    NumberWrapper(int value){
        this.value = value;
    }
}
public class SwapTwoNumbers {
    public static void main(String[] args) {
        // swap in a methhod
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        NumberWrapper a = new NumberWrapper(in.nextInt());
        System.out.println("Enter the second number: ");
        NumberWrapper b = new NumberWrapper(in.nextInt());
        swap(a, b);
        System.out.println("The value of a is: " + a.value);
        System.out.println("The value of b is: " + b.value);
    }
    static void swap(NumberWrapper a, NumberWrapper b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}