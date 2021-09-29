import java.util.Scanner;

class ar {
    int length;
    int breadth;

    public int lb() {
        return length * breadth;
    }
}

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ar side = new ar();
        side.length = sc.nextInt();
        side.breadth = sc.nextInt();
        sc.close();
        System.out.println("Area = " + side.lb());
        // Circle c = new Circle();
        // c.setRad(23);
        // System.out.println(c.getArea());
    }
}