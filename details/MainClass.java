package details;
import details.StudentPackage.RegisterStudent;
import details.StudentPackage.cgpa;

public class MainClass {
    public static void main(String[] args) {
        RegisterStudent s=new RegisterStudent();
        System.out.println("for first semester");
        s.register(1);
        s.res();
        System.out.println("for second semester");
        s.register(2);
        s.res();
        System.out.println("for third semester");
        s.register(3);
        s.res();
        System.out.println("for fourth semester");
        s.register(4);
        s.res();
        s.calculateGpa();
    }
}
