import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        // for(int i=1;i<t;i++){
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int n = in.nextInt();
        // }
        for (int i = 1; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            if (i == 1) {

                System.out.print(a + " ");
            } else if (i > 1) {
                int z = 0;

                z += Math.pow(t, i - (i - 1)) * b;
                System.out.print(z + " ");
            }
        }
        in.close();
    }
}
