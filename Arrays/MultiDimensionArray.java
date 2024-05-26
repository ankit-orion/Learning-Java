import java.util.Arrays;
import java.util.Scanner;
public class MultiDimensionArray {
    public static void main(String[] args) {
        // adding the rows in mandatory
        // adding the columns is optional
        // syntax: int[][] arr = new int[rows][columns];
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        // individual size or the number of columns in each row can be different
        // syntax: int[][] arr = new int[rows][];
        int[][] arr1 = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr1[0]));
        System.out.println(Arrays.toString(arr1[1]));
        System.out.println(Arrays.toString(arr1[2]));

        int[][] arr3= new int[3][5];
        System.out.println(arr3.length);
        // finding the length of the columm
        System.out.println(arr3[0].length);

        // user defined size
        System.out.println("Learning user defined size");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = in.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = in.nextInt();
        int[][] arr4 = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j< m; j++){
                arr4[i][j] = in.nextInt();
            }
        }
        in.close();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
