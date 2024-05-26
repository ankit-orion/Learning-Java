public class PassingInFunctions {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5};
        for(int i: elements){
            System.out.print(i + " ");
        }
        System.out.println();
        modifyArray(elements);
        for(int i: elements){
            System.out.print(i + " ");
        }
    }
    static void modifyArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] *= 2;
        }
    }
}
