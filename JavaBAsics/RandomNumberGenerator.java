import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(4);
        System.out.println(a + 1);
    }
}
