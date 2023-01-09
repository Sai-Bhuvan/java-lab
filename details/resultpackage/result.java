package details.ResultPackage;
import details.StudentPackage.cgpa;

import java.util.Scanner;

class Sgpa extends Exception{
    Sgpa(String s){
        super(s);
    }
}
public class result extends cgpa{

    public char[][] grade=new char[4][6];
    public int[] credit=new int[6];
    public  String name="";
    public String branch="";
    public int semister;
    public String[] subjects=new String[6];
    public int totalcredits=0;
    Scanner in=new Scanner(System.in);

    public  void  res(){
        for(int i=0;i<6;i++){
            System.out.println("enter marks in subject["+(i+1)+"]");
            marks[semister-1][i]=in.nextInt();
        }

        for(int i=0;i<6;i++){
            if(marks[semister-1][i]>90){
                grade[semister-1][i]='O';
                sgpa[semister-1]+=credit[i]*10;
            } else if (marks[semister-1][i]>80) {
                grade[semister-1][i]='S';
                sgpa[semister-1]+=credit[i]*9;
            }else if(marks[semister-1][i]>70){
                grade[semister-1][i]='A';
                sgpa[semister-1]=credit[i]*7;
            }else if(marks[semister-1][i]>60){
                grade[semister-1][i]='B';
                sgpa[semister-1]=credit[i]*6;
            }
            else if(marks[semister-1][i]>50){
                grade[semister-1][i]='C';
                sgpa[semister-1]=credit[i]*5;
            }
            else if(marks[semister-1][i]>40){
                grade[semister-1][i]='D';
                sgpa[semister-1]=credit[i]*5;
            }
            else{
                grade[semister-1][i]='F';
                sgpa[semister-1]=credit[i]*5;
            }


        }
        for(int i=0;i<5;i++){
            totalcredits+=credit[i];
        }
        sgpa[semister-1] /= totalcredits;

        try{
            if(sgpa[semister-1]>10){
                throw new Sgpa("Invalid SGPA Exception");
            }
            else{
                System.out.println("SGPA in semester"+semister+" = "+sgpa[semister-1]);
            }
        }
        catch(Sgpa ex){
            System.out.println(ex.getMessage());
        }
    }

}
