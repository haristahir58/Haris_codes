import java.util.ArrayList;
public class Runner_Lab12 {
    public static void main(String[] args) {

        // Students Information
        Student s1 = new Student("Muhammad Haris Tahir", "12345");
        Student s2 = new Student("Muhammad Talha Tahir", "67890");
        Student s3 = new Student("Abdullah Tahir", "11123");

        // Teachers Information
        Teacher t1 = new Teacher("Amir Hanif Dar", "34567");
        Teacher t2 = new Teacher("Ahsan Khawaja", "78965");
        Teacher t3 = new Teacher("Mukhtar Azeem", "43562");


        ArrayList<Association> lst = new ArrayList<Association>();

        //Adding Students Data
        lst.add(s1);
        lst.add(s2);
        lst.add(s3);

        //Adding Teachers Data
        lst.add(t1);
        lst.add(t2);
        lst.add(t3);

        lst.remove(1);

        // Displaying Total Data of students and teachers
        System.out.println(lst);

    }


    //            HumanResource obj = new HumanResource();
//        obj.add(s1);
//        obj.add(s2);
//        obj.add(s3);
//
//        obj.add(t1);
//        obj.add(t2);
//        obj.add(t3);
//        obj.delete(3);
//        System.out.println(obj);
    }

