package details.StudentPackage;
import  details.Student;
import details.ResultPackage.result;
import java.util.Scanner;


class CreditLimit extends Exception{
    CreditLimit(String s){
        super(s);
    }
}
public class RegisterStudent extends result implements Student{

    Scanner in=new Scanner(System.in);

    public void name(){
        System.out.println("enetr your name");
        name=in.next();
    }

    public void branch(){
        System.out.println("enter your branch");
        branch=in.next();
    }

    public  void register(int sem){
        semister= sem;
        if(semister==1){
            name();
            branch();
        }
        System.out.println("enter the name of 6 subjects registered");
        for (int i =0;i<6;i++){
            System.out.println("enter the subject"+(i+1));
            subjects[i]=in.next();
        }
        System.out.println("enter respective credits");
        int totalCredits=0;
        for (int i=0;i<6;i++){
            System.out.println("enter respective credits");
            credit[i]=in.nextInt();
            totalCredits+=credit[i];
        }

        try{
            if(totalcredits>30){
                throw new CreditLimit("Credit limit exceeded");
            }
        }
        catch(CreditLimit e){
            System.out.println("no more than 30 credits caN BE REGISTERED"+e.getMessage());
        }
    }

}
