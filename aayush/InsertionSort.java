import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 15, 4, 8, 10, 12 };
        InsSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void InsSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
