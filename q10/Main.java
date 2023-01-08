package q10;
import q10.ise.ise_department;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ise_department i=new ise_department();
        faculty f=new faculty();
        System.out.println("enter the no of faculty whose details to be entered ");
        int n=in.nextInt();
        for(int j=0;j<n;j++){
            i.readdata(f);
            if(f.experiance>20){
                i.putdata(f);
                i.projects(f);
                i.numberdesignation(f);
            }

        }
    }

}
