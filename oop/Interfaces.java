interface bicycle {
    void handle1();

    void brake();
}

class Motorcycle2 implements bicycle {
    public void handle1() {
        System.out.println("break");
    }

    public void brake() {
        System.out.println("move");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Motorcycle2 m = new Motorcycle2();
        m.handle1();
        m.brake();
    }
}
