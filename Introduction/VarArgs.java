import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,8,9,10);

        // multiple arguments of different types can be passed to the function
        // varible length arguements should alwaus be at the end
        fun2(1, 2, "Hello", "World", "Java", "Programming");
    }

    //^ variable length arguments
    static void fun(int ...v){
        // variable length arguments will internally be converted to an array
        System.out.println(v); // [I@6d06d69c this will print the address of the array
        System.out.println(Arrays.toString(v)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println("Length of the array is: "+ v.length); // 10

        // printing the elements of the array
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        // for each loop
        System.out.println();
        for(int element: v){
            System.out.print(element + " ");
        }
        System.out.println();
    }
        // ^ multiple arguments of different types can be passed to the function
        static void fun2(int a, int b, String ...v){
            System.out.print(a + " ");
            System.out.print(b +" ");
            for(String s:v){
                System.out.print(s + " ");
            }
        }
}
