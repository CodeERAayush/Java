public class Own_Custom_Class {
    // Custom Class.
    static class Employee {
        String name;
        int id;
        int Salary;

        public void printDetails() {
            System.out.println(" " + name);
            System.out.println(" " + id);
            System.out.println(" " + Salary);
        }

    }

    public static void main(String[] args) {
        // making Object e1 with Employee Class.
        Employee e1 = new Employee();// Initialization of e1 object.
        // Accessing the properties of Employee class Ex: e1.id,e2.name, etc;
        e1.id = 23;
        e1.name = "XYZ";
        e1.Salary = 1000000;
        // making Object e2 with Employee Class.
        Employee e2 = new Employee();// Initialization of e2 object.
        e2.name = "ZYX";
        e2.id = 24;
        e2.Salary = 1500000;

        e1.printDetails();
        e2.printDetails();
    }
}