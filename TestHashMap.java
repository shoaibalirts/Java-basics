
import java.util.HashMap;

class Student {

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void print() {
        System.out.println("id:" + this.id + ", name: " + this.name);
    }
}

public class TestHashMap {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();
        Student s1 = new Student("ali", 1);
        Student s2 = new Student("saad", 2);
        Student s3 = new Student("raza", 6);
        students.put("key1", s1);
        students.put("key2", s2);
        students.put("key3", s3);

        // System.out.println(students);
        boolean b = students.isEmpty();
        if (b) {
            System.out.println("hashmap is empty");
        } else {
            Student s = (Student) students.get("key2");
            System.out.println(students.get("key1"));
            System.out.println(students.get("key2"));
            System.out.println(students.get("key3"));
            s.print();
        }
    }
}
