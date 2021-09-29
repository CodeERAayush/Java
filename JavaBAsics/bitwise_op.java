import java.util.Scanner;

public class bitwise_op {
    public static void main(String[] args) {
        Scanner bit = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int x = bit.nextInt();
        int y = bit.nextInt();
        int a = x & y;
        int b = x | y;
        int c = x ^ y;
        System.out.println("And  = " + a);
        System.out.println("OR  = " + b);
        System.out.println("XOR  = " + c);
        bit.close();
    }
}
