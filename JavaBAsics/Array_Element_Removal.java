import java.util.Arrays;

import javax.swing.SpringLayout;

class Array_Element_Removal {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 5 };
        int length = 0;
        for (int i = 2; i < length; i++) {
            arr[length] = arr[i - 1];
        }
        // System.out.println(Arrays.toString(arr));
    }
}