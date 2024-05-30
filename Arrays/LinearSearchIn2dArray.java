import java.util.Scanner;
public class LinearSearchIn2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the number of columns for row " + (i+1) + ": ");
            int m = in.nextInt();
            arr[i] = new int[m];
            for(int j = 0; j < m; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.print("Enter the element to be searched: ");
        int ele = in.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == ele){
                    System.out.println("Element found at the index: " + i + " " + j);
                    System.out.println("Element is at present at the position: " + (i+1) + " " + (j+1));
                    break;
                }
            }
        }
        in.close();
    }
}
