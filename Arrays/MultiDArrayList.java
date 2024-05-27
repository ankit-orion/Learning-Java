import java.util.ArrayList;
public class MultiDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        // initializing the arraylist
        for(int i = 0; i < 3; i++){
            arr.add(new ArrayList<Integer>());
        }
    }
}
