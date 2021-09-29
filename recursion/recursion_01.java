//Printing numbers from 1 to 5 using recursion!

public class recursion_01 {
    public static void main(String[] args) {
        run(1);
    }

    static void run(int a) {
        if (a == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(a);
        run(a + 1);

    }
}