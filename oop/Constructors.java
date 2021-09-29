class Const {
    private int l, m, n;

    public Const(int l, int m) {// Constructor!
        this.l = l;
        this.m = m;
    }

    public Const(int l, int m, int n) {
        this.l = l;
        this.m = m;
        this.n = n;
    }

    public int getArea() {
        return l * m;
    }

    public int getVol() {
        return l * m * n;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Const ar = new Const(3, 2);
        Const v = new Const(3, 2, 5);
        int a = ar.getArea();
        int b = v.getVol();
        System.out.println("Area = " + a);
        System.out.println("Volume = " + b);

    }

}
