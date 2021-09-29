import java.util.Arrays;

// package algo;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { -11, -999, 0, 44, 53, 99, -1 };
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Bubble(int[] arr) {
        Boolean runner = false;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    runner = true;
                }
            }
            if (!runner) {
                break;
            }
        }
        // for (int i = 1; i <= arr.length; i++) {
        // System.out.print(" " + arr[i]);
        // }
    }
}
