
import java.util.ArrayList;

class Student {

    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        Student s1 = new Student("Shoaib", 1);
        Student s2 = new Student("Ali", 2);
        al.add(0, s1);
        al.add(1, s2);
        // System.out.println(al.get(0).name);
        // System.out.println(al.get(0).id);

        // System.out.println(al.get(0).name);
        // System.out.println(al.get(0).id);
        // System.out.println(al.get(1).name);
        // System.out.println(al.get(1).id);
        int size = al.size();
        System.out.println(size);
        for (Student item : al) {
            System.out.println(item.id * 5);

        }
    }

}
