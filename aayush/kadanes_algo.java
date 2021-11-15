class kadanes {
    public int kadanes(int arr[]) {
        int curMax = 0;
        int maxNum = 0;
        for (int i = 0; i < arr.length; i++) {
            curMax += arr[i];
            if (curMax > maxNum) {
                maxNum = curMax;

            }
            if (curMax < 0) {
                curMax = 0;
            }

        }
        return maxNum;
    }
}

public class kadanes_algo {
    public static void main(String[] args) {
        int arr[] = { 5, -1, 3, 2 };
        kadanes kd = new kadanes();
        int subSum = kd.kadanes(arr);
        System.out.println(subSum);
    }

}
