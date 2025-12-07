class calculator{
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
}

public class class_object {
    public static void main(String[] args){
        int num1=55;
        int num2=78;
        calculator cal=new calculator();
        System.out.println(cal.add(num1,num2));
    }
}
