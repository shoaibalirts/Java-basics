public class Student {
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
    public void displayStudent(){
        System.out.println(this.rollNo);
        System.out.println(this.name);
    }  
    public static void main(String args[]){
        Student s1 = new Student("abc08D","shoaib");
        s1.setData("updated-rollno-fghr354", "updated-name-Ali");
        s1.displayStudent();
    }            
}
