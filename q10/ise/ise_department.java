package q10.ise;
import java.util.Scanner;
import q10.department;
import q10.faculty;


class ageexception extends Exception{
    ageexception(String s){
        super(s);
    }
}

    public class ise_department implements department {
    // int i = 3, n;
    Scanner in = new Scanner(System.in);
    // Faculty f = new Faculty();

    public void readdata(faculty f) {
        try {
            int t;
            System.out.println("enter the name,designation,joiningdate,age,experiance,subjects,no of projects,no ofdesignations of the faculty");
            f.member_name = in.next();
            f.designation = in.next();
            f.joining_date = in.next();
            f.subjects = in.next();
            t = in.nextInt();
            f.experiance = in.nextInt();
            f.projects = in.nextInt();
            f.no_of_designations = in.nextInt();


            if (t <= 58) {
                f.age = t;
            } else {
                throw new ageexception("age exception ,your age should be less than 58");
            }
            }
        catch (ageexception e) {
            int z;
            do {
                System.out.println(e.getMessage());
                System.out.println("enter the age again");
                z = in.nextInt();
            } while (z> 58);
            f.age = z;
        }
    }

    public void putdata(faculty f) {
        System.out.println("the name,desidnation,joining date,age,experiance,subjects,no of projects,no ofdesignations handeled by the faculty are:");
        System.out.println(f.member_name);
        System.out.println(f.designation);
        System.out.println(f.joining_date);
        System.out.println(f.age);
        System.out.println(f.experiance);
        System.out.println(f.subjects);
        System.out.println(f.projects);
        System.out.println(f.no_of_designations);
    }

    public void numberdesignation(faculty f) {
        System.out.println("the no of designations the faculty has is" + f.no_of_designations);
    }

    public void projects(faculty f) {
        System.out.println("the no of projects done by faculty is:" + f.projects);
    }
    }
