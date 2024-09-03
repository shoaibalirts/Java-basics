
class Employee {

    int id;
    String name;

    // Employee() {
    //     Employee(10, "shoaib");
    // }
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(this.id + " has " + this.name);
    }

}

class Teacher extends Employee {

    String qual = "Web Developer";

    Teacher() {
        super(10, "shoaib");
    }

    void display() {
        System.out.println(this.name + " has " + this.id + ". He is a " + this.qual);
    }

}

public class EmpTeachTest {

    public static void main(String args[]) {
        Teacher t = new Teacher();
        t.display();
    }
}
