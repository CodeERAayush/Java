import java.util.Scanner;

public class outputFor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = 15;
        System.out.printf("%-15s%03d", s, b);
        sc.close();
    }
}
