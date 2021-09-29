import java.util.Scanner;

public class arithematic_op {
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        System.out.println("Enter first number ");
        int a = ar.nextInt();
        System.out.println("Enter second number ");
        int b = ar.nextInt();
        int sum = a + b;
        int mul = a * b;
        float div = (float) a / (float) b;
        int sub = a - b;
        System.out.println("Sum = " + sum);
        System.out.println("product = " + mul);
        System.out.println("division = " + div);
        System.out.println("difference = " + sub);
        ar.close();

    }
}
