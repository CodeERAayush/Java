import java.util.Arrays;

public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 7, 8, 1, 9 };
        int l = 0;
        int h = (arr.length - 1);
        QuickSort(arr, l, h);

        System.out.println(Arrays.toString(arr));
        // printArray(arr, arr.length);
    }

    public static int partition(int arr[], int l, int h) {
        int pivot = arr[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;

    }

    private static void swap(int arr[], int d, int e) {
        int temp = arr[d];
        arr[d] = arr[e];
        arr[e] = temp;

    }

    private static void QuickSort(int arr[], int l, int h) {
        if (l < h) {
            int pv = partition(arr, l, h);
            // while (h >= 0)
            QuickSort(arr, l, pv - 1);
            // while (l < h)
            QuickSort(arr, pv + 1, h);
        }
    }

    // static void printArray(int[] arr, int size) {
    // for (int i = 0; i < size; i++)
    // System.out.print(arr[i] + " ");

    // System.out.println();
    // }
}
