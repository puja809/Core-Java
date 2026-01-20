import java.util.Scanner;
class Myexception extends Exception{
    public Myexception(String str){
        //calls constructor of Exception class
        super(str);
    }
}
public class customException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        try{
            if(i!=0&&j==0){
                throw new Myexception("Cannot divide by zero!!");
            }
        }
        catch(Myexception e){
            System.out.println(e);
        }
        System.out.println((double)i/j);
    }
}
