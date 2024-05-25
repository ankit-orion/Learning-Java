import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int sum = a+ b;
        System.out.println("The sum is "+ sum);

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        int r = input.nextInt();
        int value = q+r;
        System.out.println("The sum is "+ value);
    }
}
