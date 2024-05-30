import java.util.*;
public class NoOfEvenNo {
    // creating a function to count the number of digits in a number
    static int countDigits(int n){
        int count = 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        return count;
    }
    // creating a function to return the array having the nunber of digits
    static int[] countNumbers(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = countDigits(arr[i]);
        }
        return ans;
    }
    // you will be given an array and you have to find the number of numbers that have even number of digits
    public static void main(String[] args) {
        // taking input from the user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> res =  countNumbers(arr);
        System.out.println("The number of numbers that have even number of digits are: " + Arrays.toString(ans));
        in.close();
    }
}
