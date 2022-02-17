import java.util.Scanner;

public class timeComplexity {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        String s = "";
        for (int i = 0; i < n; i++) {
            s += i;
        }
        System.out.println(s);
    }

}
