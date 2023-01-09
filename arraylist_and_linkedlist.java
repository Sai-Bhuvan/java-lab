import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class q12 {


    static  void link(){
        LinkedList<String> l=new LinkedList<>();
        Scanner in=new Scanner(System.in);
        String s;
        System.out.println("enter five strings");
        for(int i=0;i<5;i++){
            s=in.next();
            l.add(s);
        }
        System.out.println("the strings with length greater than 5 are");
        for(String y:l){
            if(y.length()>5){
                System.out.println(y);
            }
        }
       
        }
    

    static void arr(){
        ArrayList<String> l=new ArrayList<>();
        int ch;
         String s;
        Scanner in=new Scanner(System.in);
        while(true){
            
            System.out.println("enter 1:entering 2:exiting 3:display");
            ch=in.nextInt();
            switch(ch){
                case 1:System.out.println("enter the string to enter");
                    s=in.next();
                    l.add(s);
                    break;
                case 2:System.out.println( l.remove(0));
                       break;
                case 3: for(int i=0;i<l.size();i++){
                            System.out.print(l.get(i)+" ");
                        }
                        System.out.println("");
                        break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ch;
        System.out.println("enter 1:arraylist 2:linkedlist");
        ch=in.nextInt();
        switch(ch){
            case 1:arr();
            break;
            case 2:link();
            break;
        }
        // link();
    }
}
