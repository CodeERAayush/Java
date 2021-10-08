class main1 {
    public int a = 1;
    private int b = 2;
    protected int c = 3;

    public void printb() {
        System.out.println(b);
    }
}

public class Packages {
    public static void main(String[] args) {
        main1 cl = new main1();
        System.out.println(cl.a);
        cl.printb();
        // System.out.println(cl.b); --> It will give error because b is private!
        System.out.println(cl.c);
    }
}
