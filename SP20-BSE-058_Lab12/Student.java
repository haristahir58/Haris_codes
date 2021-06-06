import java.util.Scanner;

public class Student extends Person implements Association{
    private int rollNo;
    private int semester;

    public Student(){
        super("1","NULL");
    }

    public Student(String name, String id){
        super(name,id);
        associate();
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getSemester() {
        return semester;
    }


    public String toString(){
        return super.toString() + "\nRoll Number: " + rollNo + "\nSemester: " + semester;
    }


    public void associate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Roll Number: ");
        this.rollNo = input.nextInt();
        System.out.println("Please Enter your Semester: ");
        this.semester = input.nextInt();
    }
}
