import java.util.Scanner;

public class finallyBlock {
    public static void main(String[] args){
        Scanner sc=null;
        try{
            sc=new Scanner(System.in);
            System.out.println("Enter any number to proceed: ");
            int n= sc.nextInt();
        }
        finally {
            sc.close();
            System.out.println("Finally block is used to mainly close resources");
        }
    }
}
