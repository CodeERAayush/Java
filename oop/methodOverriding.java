
class Z {
  public int a;

  public int B() {
    return 4;
  }

  public void A() {
    System.out.println("Hey this is A of Base");
  }
}

class X extends Z {

  public void A() {
    System.out.println("Hey this is A of Derived");

  }
}

public class methodOverriding {
  public static void main(String[] args) {
    X dr = new X();
    dr.A();
  }
}
