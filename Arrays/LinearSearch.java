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
    // heap memory is not continuous and stack memory is continuous
    // heap memory is used for dynamic memory allocation and stack memory is used for static memory allocation
    // array is stored in heap memory
    // In java it's not necessary that the array is stored in continuous memory
    // array elements can be accessed in O(1) time
    // array elements can be accessed with its index
}
