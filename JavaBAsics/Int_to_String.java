import java.util.Scanner;

public class Int_to_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        String s = String.valueOf(a);
        System.out.println(s);
    }
}