import java.util.ArrayList;

public class codestudio_Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.remove(0);
        arr.add(0, 30);

        System.out.println(arr.size());
    }
}
