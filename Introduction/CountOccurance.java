import java.util.Scanner;

public class CountOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        System.out.println("Enter the digit to be counted: ");
        int check = in.nextInt();
        while(n>0){
            int digit = n %10;
            if(digit == check){
                count++;
            }
            n = n/10;
        }
        System.out.println("The total of " + check + " is " + count + " times.");
    }
}
