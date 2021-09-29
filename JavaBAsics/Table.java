import java.util.Scanner;

public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to print its multiplication table");
        int x = sc.nextInt();
        int i;
        sc.close();
        for (i = 1; i <= 10; i++) {
            System.out.print(x + " * " + i + " = " + (x * i));
            System.out.println();
        }

    }

}
