public class factorial {
    public static void main(String[] args) {
        int a = fac(3);
        System.out.println(a);
    }

    static int fac(int num) {
        if (num < 1) {
            return 1;
        } else
            return num * fac(num - 1);

    }
}