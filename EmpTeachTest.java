
class Employee {

    String id;
    String name;

    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    Employee() {
        this("empId-124", "Bjoern");
    }

    void display() {
        System.out.println("Employee class");
        System.out.println(this.id + " has " + this.name);
        System.out.println("----------------------");
    }

}

class Teacher extends Employee {

    String qual = "Web Developer";

    Teacher() {
        super("bjoern-w11", "Bjoernn");
    }

    void display() {
        System.out.println("Teacher class");
        System.out.println(this.name + " has " + this.id + ". He is a " + this.qual);
        System.out.println("----------------------");
    }
}

public class EmpTeachTest {

    public static void main(String args[]) {
        Employee e1 = new Employee();
        e1.display(); // empId-124, Bjoern
        Teacher t1 = new Teacher();
        t1.display(); // bjoern-w11, Bjoernn
        Employee e2 = new Teacher();
        e2.display();// bjoern-w11, Bjoernn
        Teacher t2 = (Teacher) e1;
        t2.display();// bjoern-w11, Bjoernn
    }
}
