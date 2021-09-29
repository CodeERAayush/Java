import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Scanner sq = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y)
            System.out.println("The larger in between both number is  " + x);
        else
            System.out.println("The larger in between both number is  " + y);
        sc.close();
    }
}
