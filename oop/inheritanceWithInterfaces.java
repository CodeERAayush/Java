interface call {
    void makeCall();

    void recieveCall();
}

interface AddCall extends call {
    void typeNumber();
}

class Phone implements AddCall {
    public void makeCall() {
        System.out.println("Calling...");
    }

    public void recieveCall() {
        System.out.println("Call Recieved!");
    }

    public void typeNumber() {
        System.out.println("Type Number to call");
    }
}

public class inheritanceWithInterfaces {
    public static void main(String[] args) {
        Phone ph = new Phone();
        ph.typeNumber();
        ph.makeCall();
        ph.recieveCall();
    }
}
