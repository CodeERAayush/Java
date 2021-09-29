class MyEmployee {
    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}

public class AccessModifiers_GettersSetters {

    public static void main(String[] args) {
        MyEmployee per = new MyEmployee();
        // per.id = 23;
        // per.name = "aayush"; --> DOnt work without getters and setters!
        // System.out.println(per.name);
        per.setId(23);
        per.setName("Aayush Pandey");
        System.out.println("ID = " + per.getId());
        System.out.println("NAME = " + per.getName());
    }
}
