import java.util.ArrayList;
public class MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // initializing the arraylist
        for(int i = 0; i < 3; i++){
            arr.add(new ArrayList<Integer>());
        }
        // taking input in 2d array list
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr.get(i).add(i+j);
            }
        }
        for(int i: arr.get(0)){
            System.out.print(i +" ");
        }
    }
}
