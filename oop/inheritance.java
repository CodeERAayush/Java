
class Animal {
    private int legs;

    public void setLegs(int leg) {
        legs = leg;
    }

    public int gatLegs() {
        return legs;
    }
}

class Dog extends Animal {

    String Sound = "bark";

}

public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setLegs(4);
        System.out.println("No of legs : " + d.gatLegs());
        System.out.println("Sound of the Animal : " + d.Sound);
    }
}
