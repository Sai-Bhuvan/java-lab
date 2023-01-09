package details.StudentPackage;

public class cgpa {
    public  int[][] marks =new int[4][6];
    public  int[] sgpa=new int[4];
    float cgpa=0;
    public void calculateGpa(){
        for (int i=0;i<4;i++){
            cgpa+=sgpa[i];
        }
        cgpa/=4;
        System.out.println("your cgpa is "+cgpa);
    }
}
