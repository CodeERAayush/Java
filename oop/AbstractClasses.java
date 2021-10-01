abstract class Cycle {
    abstract void wheel();

    abstract void handle();
}

class MotorCycle extends Cycle {
    public void wheel() {
        System.out.println("the motorcycle has two wheels");
    }

    public void handle() {
        System.out.println("the motorcycle handle is equipped with a lot of buttons");
    }

}

public class AbstractClasses {
    public static void main(String[] args) {
        MotorCycle mtr = new MotorCycle();
        mtr.wheel();
        mtr.handle();

        // this cannot be declared because Cycle is an Abstract class !

        // Cycle c = new Cycle();
    }
}
