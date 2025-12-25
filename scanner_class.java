import java.util.*;
public class scanner_class {
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        int x=obj.nextInt();
        System.out.println("You entered: "+x);
        double y=obj.nextDouble();
        System.out.println("You entered: "+y);
        float z=obj.nextFloat();
        System.out.println("You entered: "+z);
        boolean t= obj.nextBoolean();
        System.out.println("You entered: "+t);
        String str=obj.nextLine();//takes a sentence
        String str1=obj.next();//takes input until it meets a space
        System.out.println("You entered: "+str);
        obj.close();
    }
}
