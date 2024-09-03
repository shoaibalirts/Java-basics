
import javax.swing.JOptionPane;

// import java.lang.*;
class Student {
    private String rollNo = new String();
    private String name = new String();
    // private String confirm= new String();
    private int confirm;
    public Student(String r, String n){
        this.rollNo="default - "+r;
        this.name="default - "+n;
    }
    public Student(){
        this.rollNo = JOptionPane.showInputDialog("Enter Roll number of the student");
        this.name = JOptionPane.showInputDialog("Enter Name of the student");
        this.confirm = JOptionPane.showConfirmDialog(null, "Are you confirmed?");
    }
    public void setData(String r, String n){
        this.rollNo=r;
        this.name=n;
    }
    public String getData(){
        return "The person's roll number is "+ this.rollNo + " and name is "+this.name;
    }
    public void displayStudent(){
        // System.out.println(this.rollNo);
        // System.out.println(this.name);
        JOptionPane.showMessageDialog(null, "roll number is "+ this.rollNo + " and name is "+this.name);
        System.out.println(this.confirm);
    }                  
}
public class Test {
    public static void main(String args[]){
        Student s1 = new Student();
        // Student s1 = new Student("abc08D","shoaib");
        // s1.setData("updated-rollno-fghr354", "updated-name-Ali");
        // String receivedData = new String();
        // receivedData = s1.getData();
        s1.displayStudent();
        // System.out.println(receivedData);
        
       

       
      

     
    
    }
}