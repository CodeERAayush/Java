import java.lang.reflect.Array;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner num = new Scanner(System.in);
        int i;
        for (i = 0; i < 10; i++) {
            arr[i] = num.nextInt();

        }
        System.out.println("you entered: ");
        for (i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
