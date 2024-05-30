import java.util.Scanner;

public class LinearSearchAlgo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the element to be searched: ");
        int ele = in.nextInt();
        for(int i = 0; i < n; i++){
            if(arr[i] == ele){
                System.out.println("Element found at the index: " + i);
                System.out.println("Element is at present at the position: " + (i+1));
                break;
            }
        }
        in.close();
    }
}
