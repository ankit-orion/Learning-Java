import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] elements = new int[n];
        for(int i = 0; i < n; i++){
            elements[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int search = in.nextInt();
        for(int i = 0; i < n; i++){
            if(elements[i] == search){
                System.out.println("Element found at index " + i);
            }
        }
    }
}
