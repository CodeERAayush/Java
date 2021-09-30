import java.util.Scanner;

class ar {
    private int length;
    private int breadth;

    public void setLength(int l) {
        length = l;
    }

    public void setBr(int b) {
        breadth = b;
    }

    public int getlength() {
        return length;
    }

    public int getBr() {
        return breadth;
    }

    public int lb() {
        return length * breadth;
    }
}

public class Area {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ar side = new ar();
        int len = sc.nextInt();
        int bre = sc.nextInt();
        sc.close();
        side.setLength(len);
        side.setBr(bre);
        System.out.println("Area = " + side.lb());
        // Circle c = new Circle();
        // c.setRad(23);
        // System.out.println(c.getArea());
    }
}