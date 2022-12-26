import java.util.Scanner;

abstract public class vehicle {
    int year_of_manufacture;
    abstract void getdata();
    abstract void putdata();

    vehicle(int year){
        this.year_of_manufacture=year;
    }

}

class TwoWheeler extends vehicle{
    Scanner sc =new Scanner(System.in);

    int wheels,wheigh;
    String colour,model;
    TwoWheeler(int year,int wheels){
        super(year);
        this.wheels=wheels;
    }

    void getdata(){
        System.out.println("enter the colour ,model,wheight of two wheeler");
        this.colour=sc.next();
        this.model=sc.next();
        this.wheigh=sc.nextInt();  
    }

    void putdata(){
        System.out.println("the colour,model,wheight,wheels of two wheeler is :");
        System.out.println(colour);
        System.out.println(model);
        System.out.println(wheigh);
        System.out.println(wheels);
    }
}

final class FourWheeler extends vehicle{
    Scanner sc =new Scanner(System.in);

    int wheels,wheigh;
    String colour,model;
    FourWheeler(int year,int wheels){
        super(year);
        this.wheels=wheels;
    }

    void getdata(){
        System.out.println("enter the colour ,model,wheight of four wheeler");
        this.wheigh=sc.nextInt();
        this.colour=sc.next();
        this.model=sc.next();
    }

    void putdata(){
        System.out.println("the colour,model,wheight,wheels of four wheeler is :");
        System.out.println(colour);
        System.out.println(model);
        System.out.println(wheigh);
        System.out.println(wheels);
    }
}

class MyTwoWheeler extends TwoWheeler{
    
    MyTwoWheeler(int year,int wheels){
        super(year, wheels);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int y;
        int wh;
        System.out.println("enter the year of manufacture and wheels of two wheeler");
        y=sc.nextInt();
        wh=sc.nextInt();
        MyTwoWheeler m=new MyTwoWheeler(y, wh);
        m.getdata();
        m.putdata();
    }
}
