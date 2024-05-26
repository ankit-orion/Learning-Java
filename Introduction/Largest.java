import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // Q: Find the largest number among a, b, and c
        // Write your code here
        if(a > b && a > c){
            System.out.println(a);
        }else if(b > a && b > c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }

        // another way is to use Math.max() method
        int max = Math.max(a, Math.max(b,c));
        System.out.println("Largest number using max method: " + max);
    }
}
