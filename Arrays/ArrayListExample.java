import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        // array list is used when we don't know the size of the array
        // it is similar to vector in C++
        // syntax: ArrayList<datatype> arr = new ArrayList<datatype>();
        // syntax: ArrayList<datatype> arr = new ArrayList<datatype>(size);
        // syntax: ArrayList<datatype> arr = new ArrayList<datatype>(Collection c);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        for(int ele: arr){
            System.out.print(ele + " ");
        }
        System.out.println();
        // it will interanlly call the toString method
        System.out.println(arr);
        arr.set(0, 5);
        arr.remove(1);
        System.out.print(arr);
    }
}
