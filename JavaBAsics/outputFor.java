import java.util.Scanner;

public class outputFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%03d%n", a);
        sc.close();
    }
}