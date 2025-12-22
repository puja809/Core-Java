//final
class computer{
    public final void show(){
        System.out.println("This is a computer");
    }
}

class laptop extends computer{
    //final method cannot be override
    public void show1(){
        System.out.println("This is a Laptop");
    }
}

public class final_keyword {
    public static void main(String[] args){
        final int a=100;
//        a=10;
        System.out.println(a);
        laptop obj=new laptop();
        obj.show1();

        computer obj1 = new computer();
        obj1.show();

    }
}
