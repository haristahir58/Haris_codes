import java.util.Scanner;

public class Teacher extends Person implements Association {

    private String designation;
    private String department;

    public Teacher(){
        super("1","Null");
    }

    public Teacher(String name, String id){
        super(name, id);
        associate();
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String toString(){
        return super.toString() + "\nDesignation: " + designation + "\nDepartment: " + department;
    }

    public void associate(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your Designation: ");
        this.designation = input.next();
        System.out.println("Please Enter your Department: ");
        this.department = input.next();
    }
}
