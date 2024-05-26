import java.util.Scanner;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        if(Check(n)){
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }
    }
    static boolean Check(int n){
        boolean isPrime = true;
        if(n<=1){
            isPrime = false;
            return isPrime;
        }
        for(int i = 2; i * i <= n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
