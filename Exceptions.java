import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=99;
        System.out.print("Enter a number: ");
        int j=sc.nextInt();
        try{
            double result=i/j;
            System.out.println(result);
        }
        catch(Exception e) {
            System.out.println("Invalid division!!");
        }
        System.out.println("Code End!");
    }
}
