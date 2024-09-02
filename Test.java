class Student {
    private String rollNo = new String();
    private String name = new String();
    public Student(String r, String n){
        this.rollNo="default - "+r;
        this.name="default - "+n;
    }
    public void setData(String r, String n){
        this.rollNo=r;
        this.name=n;
    }
    public String getData(){
        return "The person's roll number is "+ this.rollNo + " and name is "+this.name;
    }
    public void displayStudent(){
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }                  
}
public class Test {
    public static void main(String args[]){
        Student s1 = new Student("abc08D","shoaib");
        s1.setData("updated-rollno-fghr354", "updated-name-Ali");
        String receivedData = new String();
        receivedData = s1.getData();
        s1.displayStudent();
        System.out.println(receivedData);
    }
}