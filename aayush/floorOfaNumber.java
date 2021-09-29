import java.util.Scanner;

public class floorOfaNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 19, 33, 200, 340, 444, 510 };
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = floor(arr, num);
        System.out.println(ans);
        sc.close();
    }

    static int floor(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                st = mid + 1;
            }
        }
        return arr[end];
    }
}
