
public class star_pattern {
    public static void main(String[] args) {
        int i;
        int j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6 - i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

}
