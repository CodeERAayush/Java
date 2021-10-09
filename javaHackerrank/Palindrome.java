// palendrome refers to the word which remains same after reversing.
//Eg : madam,tenet,mom etc.

import java.io.*;
import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int j = A.length();
        for (int i = 0; i <= j - 1; i++) {
            if (A.charAt(i) == A.charAt(j - 1 - i)) {
                count++;
            }
        }
        String ans = (count == j - 1 / 2) ? "Yes" : "No";
        System.out.println(ans);
        /* Enter your code here. Print output to STDOUT. */

    }
}
